package questão_01;

public class Diario implements iRelatorio {

    protected Diario() {

    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório diário gerado!");
    }
}
