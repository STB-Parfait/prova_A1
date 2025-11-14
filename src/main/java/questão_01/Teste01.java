package questão_01;

public class Teste01 {
    public static void main(String[] args) {

        iFactory fabricaDiario = new FactoryDiario();
        iFactory fabricaSemanal = new FactorySemanal();

        iRelatorio relatorioDiario = fabricaDiario.createRelatorio();
        iRelatorio relatorioSemanal = fabricaSemanal.createRelatorio();

        relatorioDiario.gerarRelatorio();
        relatorioSemanal.gerarRelatorio();
    }
}
