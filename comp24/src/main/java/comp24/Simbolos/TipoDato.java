package comp24.Simbolos;

public enum TipoDato {
    INT, DOUBLE, STRING, VOID;

    public static TipoDato fromString(String tipo) {
        switch (tipo.toLowerCase()) {
            case "int":
                return INT;
            case "double":
                return DOUBLE;
            case "string":
                return STRING;
            case "void":
                return VOID;
            default:
                throw new IllegalArgumentException("Tipo dato non valido: " + tipo);
        }
    }
}
