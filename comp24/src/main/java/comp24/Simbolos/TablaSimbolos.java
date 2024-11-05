package comp24.Simbolos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TablaSimbolos {
    private static TablaSimbolos instance;
    private Stack<Contexto> contextos = new Stack<>();

    private TablaSimbolos() {}

    public static TablaSimbolos getInstance() {
        if (instance == null) {
            instance = new TablaSimbolos();
        }
        return instance;
    }

    public void addContexto() {
        contextos.push(new Contexto());
    }

    public void delContexto() {
        if (!contextos.isEmpty()) {
            contextos.pop();
        }
    }

    public void addIdentificador(String nombre, TipoDato tdato, boolean esFuncion, List<TipoDato> args) {
        ID nuevoId;
        if (esFuncion) {
            nuevoId = new Funcion(nombre, tdato, args);
        } else {
            nuevoId = new Variable(nombre, tdato);
        }
        if (!contextos.isEmpty()) {
            contextos.peek().addId(nuevoId);
        }
    }

    public ID buscarLocal(String nombre) {
        if (!contextos.isEmpty()) {
            return contextos.peek().getId(nombre);
        }
        return null;
    }

    public ID buscarGlobal(String nombre) {
        for (int i = contextos.size() - 1; i >= 0; i--) {
            ID id = contextos.get(i).getId(nombre);
            if (id != null) {
                return id;
            }
        }
        return null;
    }

    public List<ID> verificarUsados() {
        List<ID> noUsados = new ArrayList<>();
        for (Contexto contexto : contextos) {
            for (ID id : contexto.getSimbolos().values()) {
                if (!id.esUsado()) {
                    noUsados.add(id);
                }
            }
        }
        return noUsados;
    }

    public boolean verificarTipo(String nombre, TipoDato tipoAtteso) {
        ID id = buscarGlobal(nombre);
        return id != null && id.getTipoDato() == tipoAtteso;
    }

    public void registrarUso(String nombre) {
        ID id = buscarGlobal(nombre);
        if (id != null) {
            id.setUsado();
        }
    }

    public void verificarUsoSimbolos() {
        for (Contexto contexto : contextos) {
            for (ID simbolo : contexto.getSimbolos().values()) {
                if (!simbolo.esUsado()) {
                    System.err.println("Warning: " + (simbolo instanceof Funcion ? "Funcion" : "Variable") + 
                                       " '" + simbolo.getNombre() + "' declarada pero no utilizada.");
                }
            }
        }
    }
}
