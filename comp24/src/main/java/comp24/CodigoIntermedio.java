package comp24;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodigoIntermedio {
    private List<String> instrucciones;

    public CodigoIntermedio() {
        this.instrucciones = new ArrayList<>();
    }

    public void agregarInstruccion(String instruccion) {
        instrucciones.add(instruccion);
    }

    public List<String> getInstrucciones() {
        return instrucciones;
    }

    public void imprimirCodigoIntermedio() {
        System.out.println("Codigo Intermedio:");
        for (String instruccion : instrucciones) {
            System.out.println(instruccion);
        }
    }

    public void guardarCodigoIntermedio(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String instruccion : instrucciones) {
                writer.write(instruccion + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}