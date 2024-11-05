package comp24.Simbolos;

public abstract class ID {
    protected String nombre;
    protected TipoDato tdato;
    protected boolean inicializado = false;
    protected boolean usado = false;

    public ID(String nombre, TipoDato tdato) {
        this.nombre = nombre;
        this.tdato = tdato;
    }

    public void setInicializado() {
        this.inicializado = true;
    }

    public void setUsado() {
        this.usado = true;
    }

    public boolean esInicializado() {
        return inicializado;
    }

    public boolean esUsado() {
        return usado;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDato getTipoDato() {
        return tdato;
    }
}
