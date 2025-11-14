package questão_01;

public class Teste01 {
    public static void main(String[] args) {

        //O padrão factory foi usado pela necessidade
        //de poder gerar vários relatórios diferentes
        //podendo escalar fácilmente

        iFactory fabricaDiario = new FactoryDiario();
        iFactory fabricaSemanal = new FactorySemanal();

        iRelatorio relatorioDiario = fabricaDiario.createRelatorio();
        iRelatorio relatorioSemanal = fabricaSemanal.createRelatorio();

        relatorioDiario.gerarRelatorio();
        relatorioSemanal.gerarRelatorio();
    }
}
