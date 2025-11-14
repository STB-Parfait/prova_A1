package questão_01;

public class FactorySemanal implements iFactory {
    @Override
    public iRelatorio createRelatorio() {
        return new Semanal();
    }
}
