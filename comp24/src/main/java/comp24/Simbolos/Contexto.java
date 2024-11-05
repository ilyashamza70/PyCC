package comp24.Simbolos;
import java.util.HashMap;
import java.util.Map;

public class Contexto {
    private Map<String, ID> simbolos = new HashMap<>();

    public ID getId(String nombre) {
        return simbolos.get(nombre);
    }

    public void addId(ID id) {
        simbolos.put(id.getNombre(), id);
    }

    public Map<String, ID> getSimbolos() {
        return simbolos;
    }

    public boolean contiene(String nombre) {
        return simbolos.containsKey(nombre);
    }
}
