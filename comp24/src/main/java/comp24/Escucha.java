package comp24;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import comp24.comp24Parser.*;
import comp24.Simbolos.Funcion;
import comp24.Simbolos.ID;
import comp24.Simbolos.TablaSimbolos;
import comp24.Simbolos.TipoDato;
import comp24.Simbolos.Variable;

public class Escucha extends comp24BaseListener {

    private Integer nodos = 0; // Counter for visited nodes
    private Integer hojas = 0; // Counter for terminal nodes (leaves)
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance(); // Singleton symbol table

    /**
     * Triggered when entering the root rule 'programa'.
     */
    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("Parsing begins...");
    }

    /**
     * Triggered when exiting the root rule 'programa'.
     */
    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("Visited " + nodos + " nodes");
        System.out.println("Found " + hojas + " leaves");
        System.out.println("Parsing completed!");

        // Final check for unused variables or functions
        tablaSimbolos.verificarUsoSimbolos();
        tablaSimbolos.imprimirTablaSimbolos();
    }

    /**
     * Triggered for every rule entered. Used to count nodes.
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        nodos++;
    }

    /**
     * Triggered for terminal nodes. Used to count leaves.
     */
    @Override
    public void visitTerminal(TerminalNode node) {
        hojas++;
    }

    /**
     * Handles variable declarations.
     */
    @Override
    public void enterDeclaracion(DeclaracionContext ctx) {
        System.out.println("\tAnalyzing declaration: " + ctx.getText());

    }
    
    @Override
public void exitDeclaracion(DeclaracionContext ctx) {
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
                    System.out.println("\tVariable '" + varName + "' declared successfully.");
                }
            }
        }
    } else {
        System.err.println("\tError: Missing variable name in declaration.");
    }
    System.out.println("\tDeclaration analyzed: " + ctx.getText());
}

    /**
     * Handles variable assignments.
     */
    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        System.out.println("\tAnalyzing assignment: " + ctx.getText());

    }
    @Override
    public void exitAsignacion(AsignacionContext ctx) {
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
            }
        } else {
            System.err.println("\tError: Missing variable name or value in assignment.");
        }
        System.out.println("\tAssignment analyzed: " + ctx.getText());
    }

    /**
     * Handles function declarations.
     */
    @Override
    public void enterDeclara_func(Declara_funcContext ctx) {
        System.out.println("\tAnalyzing function declaration: " + ctx.getText());
        String funcName = ctx.ID().getText();
        String returnType = ctx.tdato().getText();

        // Register function in the symbol table
        if (!tablaSimbolos.agregarSimbolo(funcName, returnType,false,null)) {
            System.err.println("\tError: Function '" + funcName + "' already declared.");
        }
    }


    /**
     * Handles loops (while).
     */
    @Override
    public void enterInst_while(Inst_whileContext ctx) {
        System.out.println("\tAnalyzing 'while' loop: " + ctx.getText());

        // Check if condition is valid
        if (ctx.comparacion() == null) {
            System.err.println("\tError: 'while' loop condition missing or invalid.");
        }
    }

    /**
     * Handles conditionals (if-else).
     */
    @Override
    public void enterInstruccion_if(Instruccion_ifContext ctx) {
        System.out.println("\tAnalyzing 'if' statement: " + ctx.getText());

        // Check if condition is valid
        if (ctx.comparacion() == null) {
            System.err.println("\tError: 'if' condition missing or invalid.");
        }
    }

    @Override
    public void enterInstruccion_else(Instruccion_elseContext ctx) {
        System.out.println("\tAnalyzing 'else' statement: " + ctx.getText());
    }

    /**
     * Handles arithmetic expressions.
     */
    @Override
    public void enterExp(ExpContext ctx) {
        System.out.println("\tAnalyzing expression: " + ctx.getText());
    }

    /**
     * Handles logical comparisons.
     */
    @Override
    public void enterComparacion(ComparacionContext ctx) {
        System.out.println("\tAnalyzing comparison: " + ctx.getText());
        
    }
    @Override
    public void exitComparacion(ComparacionContext ctx) {
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
        System.out.println("\tAnalyzing comparison: " + ctx.getText());

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
    /**
     * Handles function calls.
     */
    
    @Override
    public void enterFuncion(FuncionContext ctx) {
        System.out.println("\tAnalyzing function definition: " + ctx.getText());
    }
    @Override
    public void exitFuncion(FuncionContext ctx){
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
        } else {
            System.out.println("\tFunction '" + funcName + "' defined successfully.");
        }
    }

    @Override
    public void enterLlamada_func(Llamada_funcContext ctx) {
        System.out.println("\tAnalyzing function call: " + ctx.getText());
 
    }
    @Override
    public void exitLlamada_func(comp24Parser.Llamada_funcContext ctx) {
        String funcName = ctx.ID().getText();
        ID funcion = tablaSimbolos.buscarGlobal(funcName);
        if (funcion == null || !(funcion instanceof Funcion)) {
            System.err.println("\tError: Function '" + funcName + "' not declared.");
            return;
        }
    
        Funcion func = (Funcion) funcion;
        List<TipoDato> expectedArgs = func.getArgs();
        List<ExpContext> providedArgs = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof ExpContext) {
                providedArgs.add((ExpContext) ctx.getChild(i));
            }
        }
    
        if (expectedArgs.size() != providedArgs.size()) {
            System.err.println("\tError: Function '" + funcName + "' called with incorrect number of arguments.");
        } else {
            for (int i = 0; i < expectedArgs.size(); i++) {
                // Additional checks can be added here for argument type matching
            }
        }
    }
    @Override
    public void enterBucle(comp24Parser.BucleContext ctx) {
        System.out.println("\tAnalyzing loop: " + ctx.getText());
    

    }
    
    @Override
    public void exitBucle(comp24Parser.BucleContext ctx) {
        // Check if condition is valid
        if (ctx.WHILE() != null && ctx.comparacion() == null) {
            System.err.println("\tError: 'while' loop condition missing or invalid.");
        } else if (ctx.FOR() != null && (ctx.comparacion() == null || ctx.asignacion().size() != 2)) {
            System.err.println("\tError: 'for' loop condition or assignments missing or invalid.");
        }
        System.out.println("\tFinished analyzing loop: " + ctx.getText());
    }

    @Override
    public void enterCondicional(comp24Parser.CondicionalContext ctx) {
        System.out.println("\tAnalyzing 'if' statement: " + ctx.getText());

        // Check if condition is valid
        if (ctx.comparacion() == null) {
            System.err.println("\tError: 'if' condition missing or invalid.");
        }
    }

    @Override
    public void exitCondicional(comp24Parser.CondicionalContext ctx) {
        System.out.println("\tFinished analyzing 'if' statement: " + ctx.getText());
    }

    /**
     * Handles return statements.
     */
    @Override
    public void enterReturn(ReturnContext ctx) {
        System.out.println("\tAnalyzing 'return' statement: " + ctx.getText());
        if (ctx.opal() != null && !tablaSimbolos.existeSimbolo(ctx.opal().getText())) {
            System.err.println("\tError: Variable '" + ctx.opal().getText() + "' not declared.");
        }
    }

}
