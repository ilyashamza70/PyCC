package comp24;

import comp24.comp24Parser.Declara_funcContext;
import comp24.comp24Parser.FuncionContext;
import comp24.comp24Parser.Inst_whileContext;
import comp24.comp24Parser.Instruccion_ifContext;
import comp24.comp24Parser.DeclaracionContext;
import comp24.comp24Parser.AsignacionContext;
import comp24.comp24Parser.ComparacionContext;
import comp24.comp24Parser.Llamada_funcContext;
import comp24.comp24Parser.ReturnContext;
import comp24.comp24Parser.ParametroContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import comp24.Simbolos.*;

public class Walker extends comp24BaseVisitor<String> {

    private CodigoIntermedio codigoIntermedio = new CodigoIntermedio();
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();

    @Override
    public String visitDeclara_func(Declara_funcContext ctx) {
        String funcName = ctx.ID().getText();
        String returnType = ctx.tdato().getText();

        // Register function in the symbol table
        if (!tablaSimbolos.agregarSimbolo(funcName, returnType,true, null)) {
            System.err.println("\tError: Function '" + funcName + "' already declared.");
        }

        // Generate intermediate code for function declaration
        codigoIntermedio.agregarInstruccion("FUNC " + funcName + " BEGIN");
        return visitChildren(ctx);
    }

    @Override
    public String visitFuncion(FuncionContext ctx) {
        String funcName = ctx.ID().getText();
        String returnType = ctx.tdato().getText();
        List<TipoDato> args = new ArrayList<>();

        // Collect parameter types
        if (ctx.parametros() != null) {
            for (ParametroContext paramCtx : ctx.parametros().parametro()) {
                args.add(TipoDato.fromString(paramCtx.tdato().getText()));
            }
        }

        // Register function in the symbol table
        if (!tablaSimbolos.agregarSimbolo(funcName, returnType, true, args)) {
            System.err.println("\tError: Function '" + funcName + "' already declared.");
        }

        // Generate intermediate code for function definition
        codigoIntermedio.agregarInstruccion("FUNC " + funcName + " BEGIN");
        visitChildren(ctx);
        // Generate intermediate code for function end
        codigoIntermedio.agregarInstruccion("FUNC " + funcName + " END");
        return null;
    }

    @Override
    public String visitInst_while(Inst_whileContext ctx) {
        // Generate intermediate code for while loop
        codigoIntermedio.agregarInstruccion("WHILE " + ctx.comparacion().getText() + " DO");
        visitChildren(ctx);
        // Generate intermediate code for end of while loop
        codigoIntermedio.agregarInstruccion("END WHILE");
        return null;
    }

    @Override
    public String visitInstruccion_if(Instruccion_ifContext ctx) {
        // Generate intermediate code for if statement
        codigoIntermedio.agregarInstruccion("IF " + ctx.comparacion().getText() + " THEN");
        visit(ctx.bloque(0)); // Visit the 'if' block

        // Check if there is an 'else' block
        if (ctx.ELSE() != null) {
            codigoIntermedio.agregarInstruccion("ELSE");
            visit(ctx.bloque(1)); // Visit the 'else' block
        }

        // Generate intermediate code for end of if statement
        codigoIntermedio.agregarInstruccion("END IF");
        return null;
    }

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        // Verifica che ctx.ID(0) esista
        if (ctx.ID().size() > 0) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                String varName = ctx.ID(i).getText();
                String varType = ctx.tdato().getText();
                String varValue = null;

                // Check if there is an assignment
                if (ctx.ASIG(i) != null && ctx.opal(i) != null) {
                    varValue = ctx.opal(i).getText();
                }

                // Check if variable is already declared
                if (tablaSimbolos.existeSimbolo(varName)) {
                    System.err.println("\tError: Variable '" + varName + "' already declared.");
                } else {
                    // Register variable in the symbol table
                    boolean success = tablaSimbolos.agregarSimbolo(varName, varType,false,null);
                    if (!success) {
                        System.err.println("\tError: Failed to declare variable '" + varName + "'.");
                    } else {
                        // Set the initial value if there is an assignment
                        Variable var = (Variable) tablaSimbolos.buscarGlobal(varName);
                        if (varValue != null) {
                            var.setValorInicial(varValue);
                            var.setValor(varValue);
                        }
                    }
                }

                // Generate intermediate code for variable declaration
                if (varValue != null) {
                    codigoIntermedio.agregarInstruccion(varType + " " + varName + " = " + varValue);
                } else {
                    codigoIntermedio.agregarInstruccion(varType + " " + varName);
                }
            }
        } else {
            System.err.println("\tError: Missing variable name in declaration.");
        }
        return visitChildren(ctx);
    }

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        // Verifica che ctx.ID() esista
        if (ctx.ID() != null && ctx.opal() != null) {
            String varName = ctx.ID().getText();
            String value = ctx.opal().getText();

            // Check if variable is declared
            if (!tablaSimbolos.existeSimbolo(varName)) {
                System.err.println("\tError: Variable '" + varName + "' not declared.");
            } else {
                // Set the variable as used and update its value
                Variable var = (Variable) tablaSimbolos.buscarGlobal(varName);
                var.setUsado(true);
                var.setValor(value);

                // Check if the variable has an initial value, if not, set it
                if (var.getValorInicial() == null) {
                    var.setValorInicial(value);
                }

                // Generate intermediate code for assignment
                codigoIntermedio.agregarInstruccion(varName + " = " + value);
            }
        } else {
            System.err.println("\tError: Missing variable name or value in assignment.");
        }
        return visitChildren(ctx);
    }

    @Override
    public String visitComparacion(ComparacionContext ctx) {
        // Verifica che ctx.opal(0) e ctx.opal(1) esistano
        if (ctx.opal(0) != null && ctx.opal(1) != null) {
            String leftOperand = ctx.opal(0).getText();
            String rightOperand = ctx.opal(1).getText();

            // Validate the left operand
            if (!isNumber(leftOperand) && !tablaSimbolos.existeSimbolo(leftOperand)) {
                System.err.println("\tError: Variable '" + leftOperand + "' not declared.");
            }

            // Validate the right operand
            if (!isNumber(rightOperand) && !tablaSimbolos.existeSimbolo(rightOperand)) {
                System.err.println("\tError: Variable '" + rightOperand + "' not declared.");
            }
        } else {
            // Controlla se il contesto padre è una dichiarazione o un'assegnazione
            ParserRuleContext parentCtx = ctx.getParent();
            if (parentCtx instanceof comp24Parser.DeclaracionContext || parentCtx instanceof comp24Parser.AsignacionContext) {
                // Non fare nulla, è una dichiarazione o un'assegnazione
            } else {
                System.err.println("\tError: Missing operands in comparison.");
            }
        }
        return visitChildren(ctx);
    }

 @Override
public String visitLlamada_func(Llamada_funcContext ctx) {
    String funcName = ctx.ID().getText();
    ID funcion = tablaSimbolos.buscarGlobal(funcName);
    if (funcion == null || !(funcion instanceof Funcion)) {
        System.err.println("\tError: Function '" + funcName + "' not declared.");
        return null;
    }

    Funcion func = (Funcion) funcion;
    List<TipoDato> expectedArgs = func.getArgs();
    List<String> providedArgs = new ArrayList<>();
    

    if (expectedArgs.size() != providedArgs.size()) {
        System.err.println("\tError: Function '" + funcName + "' called with incorrect number of arguments.");
    }

    // Generate intermediate code for function call
    codigoIntermedio.agregarInstruccion("CALL " + funcName + " " + providedArgs.toString());
    return visitChildren(ctx);
}

    @Override
    public String visitReturn(ReturnContext ctx) {
        if (ctx.opal() != null && !tablaSimbolos.existeSimbolo(ctx.opal().getText())) {
            System.err.println("\tError: Variable '" + ctx.opal().getText() + "' not declared.");
        }

        // Generate intermediate code for return statement
        codigoIntermedio.agregarInstruccion("RETURN " + ctx.opal().getText());
        return visitChildren(ctx);
    }

    public void imprimirCodigoIntermedio() {
        codigoIntermedio.imprimirCodigoIntermedio();
    }

    public void guardarCodigoIntermedio(String fileName) {
        codigoIntermedio.guardarCodigoIntermedio(fileName);
    }

    // Metodo di utilità per verificare se una stringa è un numero
    private boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}