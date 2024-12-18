package comp24.Simbolos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.io.FileWriter;
import java.io.IOException;
public class TablaSimbolos {
    private static TablaSimbolos instance;
    private Stack<Contexto> contextos = new Stack<>();

    public TablaSimbolos() {
                contextos.push(new Contexto());

    }

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

    public boolean agregarSimbolo(String nombre, String tipo, boolean esFuncion, List<TipoDato> args) {
        if (buscarLocal(nombre) == null) {
            TipoDato tipoDato = TipoDato.fromString(tipo);
            if (tipoDato == null) {
                System.err.println("Error: Tipo di dato non riconosciuto '" + tipo + "'.");
                return false;
            }
            ID nuevoId;
            if (esFuncion) {
                nuevoId = new Funcion(nombre, tipoDato, args);
            } else {
                nuevoId = new Variable(nombre, tipoDato);
            }
            if (!contextos.isEmpty()) {
                contextos.peek().addId(nuevoId);
                return true;
            }
        }
        return false; // Il simbolo esiste già localmente
    }

    public boolean existeSimbolo(String nombre) {
        return buscarGlobal(nombre) != null;
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
    
    
    public void imprimirTablaSimbolos() {
        String fileName = "TablaSimbolos.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            String header = "Tabla de Simbolos:\n" +
                            "--------------------------------------------------------------------\n" +
                            String.format("| %-10s | %-10s | %-10s | %-13s | %-10s |\n", "Tipo", "Nombre", "Tipo Dato", "ValoreInicial", "Usado") +
                            "--------------------------------------------------------------------\n";
            System.out.print(header);
            writer.write(header);
    
            for (Contexto contexto : contextos) {
                for (ID simbolo : contexto.getSimbolos().values()) {
                    String line;
                    if (simbolo instanceof Funcion) {
                        Funcion funcion = (Funcion) simbolo;
                        line = String.format("| %-10s | %-10s | %-10s | %-13s | %-10s |\n", 
                                             "Funcion", funcion.getNombre(), funcion.getTipoDato(), "N/A", funcion.esUsado() ? "Si" : "No");
                    } else if (simbolo instanceof Variable) {
                        Variable variable = (Variable) simbolo;
                        line = String.format("| %-10s | %-10s | %-10s | %-13s | %-10s |\n", 
                                             "Variable", variable.getNombre(), variable.getTipoDato(), variable.getValorInicial(), variable.esUsado() ? "Si" : "No");
                    } else {
                        continue;
                    }
                    System.out.print(line);
                    writer.write(line);
                }
            }
            String footer = "--------------------------------------------------------------------\n";
            System.out.print(footer);
            writer.write(footer);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
}
