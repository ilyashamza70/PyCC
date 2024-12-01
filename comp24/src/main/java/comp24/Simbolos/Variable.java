package comp24.Simbolos;

public class Variable extends ID {
    private boolean usado;
    private String valor;
    private String valorInicial;

    public Variable(String nombre, TipoDato tdato) {
        super(nombre, tdato);
        this.usado = false;
        this.valor = null;
        this.valorInicial = null;
    }

    public boolean esUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(String valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    public String toString() {
        return "Variable: " + nombre + " Tipo: " + tdato + " Valor Inicial: " + valorInicial;
    }
}