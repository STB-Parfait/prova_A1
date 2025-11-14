package questão_02;

public class Context {
    private iEstrategia estrategia;
    public Context(iEstrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void setEstrategia(iEstrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void executarEstrategia() {
        this.estrategia.investir();
    }
}
