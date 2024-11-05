package comp24.Simbolos;

public class Variable extends ID {

    public Variable(String nombre, TipoDato tdato) {
        super(nombre, tdato);
    }

    @Override
    public String toString() {
        return "Variable: " + nombre + " Tipo: " + tdato;
    }
}

