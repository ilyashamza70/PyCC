package comp24;

import comp24.comp24Parser.Declara_funcContext;
import comp24.comp24Parser.FuncionContext;
import comp24.comp24Parser.Inst_whileContext;
import comp24.comp24Parser.Instruccion_ifContext;
import comp24.comp24Parser.DeclaracionContext;
import comp24.comp24Parser.AsignacionContext;
import comp24.comp24Parser.BucleContext;
import comp24.comp24Parser.ComparacionContext;
import comp24.comp24Parser.CondicionalContext;
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
    private int tempVarCount = 0;
    private int labelCount = 0;

    private String newTempVar() {
        return "t" + (tempVarCount++);
    }

    private String newLabel() {
        return "L" + (labelCount++);
    }

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
            //System.err.println("\tError: Function '" + funcName + "' already declared.");
        }

        // Generate intermediate code for function definition
        codigoIntermedio.agregarInstruccion("FUNC " + funcName + " BEGIN");
        visitChildren(ctx);
        // Generate intermediate code for function end
        codigoIntermedio.agregarInstruccion("FUNC " + funcName + " END");
        return null;
    }
    
    @Override
    public String visitBucle(BucleContext ctx) {
        String startLabel = newLabel();
        String endLabel = newLabel();
    
        // Generate intermediate code for while loop
        codigoIntermedio.agregarInstruccion(startLabel + ":");
        String condition = visit(ctx.comparacion());
        if (condition == null) {
            condition = "false";
        }
        codigoIntermedio.agregarInstruccion("IF " + condition + " GOTO " + endLabel);
        visit(ctx.bloque());
        codigoIntermedio.agregarInstruccion("GOTO " + startLabel);
        codigoIntermedio.agregarInstruccion(endLabel + ":");
        return null;
    }
    
    @Override
    public String visitCondicional(CondicionalContext ctx) {
        String elseLabel = newLabel();
        String endLabel = newLabel();
    
        // Generate intermediate code for if statement
        String condition = visit(ctx.comparacion());
        codigoIntermedio.agregarInstruccion("IF " + condition + " GOTO " + elseLabel);
        visit(ctx.bloque()); // Visit the 'if' block
    
        // Check if there is an 'else' block
        if (ctx.else_opcional() != null) {
            codigoIntermedio.agregarInstruccion("GOTO " + endLabel);
            codigoIntermedio.agregarInstruccion(elseLabel + ":");
            visit(ctx.else_opcional().bloque()); // Visit the 'else' block
            codigoIntermedio.agregarInstruccion(endLabel + ":");
        } else {
            codigoIntermedio.agregarInstruccion(elseLabel + ":");
        }
    
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
                   // System.err.println("\tError: Variable '" + varName + "' already declared.");
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
    public String visitComparacion(comp24Parser.ComparacionContext ctx) {
        // Verifica che ctx.opal(0) e ctx.opal(1) esistano
        if (ctx.opal(0) != null && ctx.opal(1) != null) {
            String leftOperand = visit(ctx.opal(0));
            String rightOperand = visit(ctx.opal(1));
            String operator = ctx.logic().getText();
    
            // Validate the left operand
            if (leftOperand == null || (!isNumber(leftOperand) && !tablaSimbolos.existeSimbolo(leftOperand))) {
                System.err.println("\tError: Variable '" + leftOperand + "' not declared.");
            }
    
            // Validate the right operand
            if (rightOperand == null || (!isNumber(rightOperand) && !tablaSimbolos.existeSimbolo(rightOperand))) {
                System.err.println("\tError: Variable '" + rightOperand + "' not declared.");
            }
    
            return leftOperand + " " + operator + " " + rightOperand;
        } else {
            System.err.println("\tError: Missing operands in comparison.");
        }
        return null;
    }

    @Override
    public String visitOpal(comp24Parser.OpalContext ctx) {
        if (ctx.exp() != null) {
            return visit(ctx.exp());
        }
        return null;
    }

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        // Verifica che ctx.ID() esista
        if (ctx.ID() != null && ctx.opal() != null) {
            String varName = ctx.ID().getText();
            String value = visit(ctx.opal());
    
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
                if (value.startsWith("t")) {
                    // If the value is a temporary variable, use it directly
                    codigoIntermedio.agregarInstruccion(varName + " = " + value);
                } else {
                    // Otherwise, generate a temporary variable
                    String tempVar = newTempVar();
                    codigoIntermedio.agregarInstruccion(tempVar + " = " + value);
                    codigoIntermedio.agregarInstruccion(varName + " = " + tempVar);
                }
            }
        } else {
            System.err.println("\tError: Missing variable name or value in assignment.");
        }
        return null;
    }

    @Override
    public String visitExp(comp24Parser.ExpContext ctx) {
        if (ctx.term() != null && ctx.exp() == null) {
            return visit(ctx.term());
        } else if (ctx.SUMA() != null || ctx.RESTA() != null) {
            String left = visit(ctx.exp());
            String right = visit(ctx.term());
            String operator = ctx.SUMA() != null ? "+" : "-";
            String tempVar = newTempVar();
            codigoIntermedio.agregarInstruccion(tempVar + " = " + left + " " + operator + " " + right);
            return tempVar;
        }
        return null;
    }

    @Override
    public String visitTerm(comp24Parser.TermContext ctx) {
        if (ctx.factor() != null && ctx.term() == null) {
            return visit(ctx.factor());
        } else if (ctx.MULT() != null || ctx.DIV() != null || ctx.MOD() != null) {
            String left = visit(ctx.term());
            String right = visit(ctx.factor());
            String operator = ctx.MULT() != null ? "*" : ctx.DIV() != null ? "/" : "%";
            String tempVar = newTempVar();
            codigoIntermedio.agregarInstruccion(tempVar + " = " + left + " " + operator + " " + right);
            return tempVar;
        }
        return null;
    }

    @Override
    public String visitFactor(comp24Parser.FactorContext ctx) {
        if (ctx.NUMERO() != null) {
            return ctx.NUMERO().getText();
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.PA() != null && ctx.exp() != null && ctx.PC() != null) {
            return visit(ctx.exp());
        }
        return null;
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
            //System.err.println("\tError: Variable '" + ctx.opal().getText() + "' not declared.");
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
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}