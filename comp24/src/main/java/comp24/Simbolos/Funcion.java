package comp24.Simbolos;

import java.util.List;

public class Funcion extends ID {
    private List<TipoDato> args;

    public Funcion(String nombre, TipoDato tdato, List<TipoDato> args) {
        super(nombre, tdato);
        this.args = args;
    }

    public List<TipoDato> getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return "Function: " + nombre + " Return Type: " + tdato + " Args: " + args;
    }
}

