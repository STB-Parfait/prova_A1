package questão_01;

public class Semanal implements iRelatorio {

    protected Semanal() {

    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório semanal gerado!");
    }
}
