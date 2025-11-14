package questão_01;

public class FactoryDiario implements iFactory {

    @Override
    public iRelatorio createRelatorio() {
        return new Diario();
    }
}
