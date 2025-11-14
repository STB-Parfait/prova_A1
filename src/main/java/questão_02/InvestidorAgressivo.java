package questão_02;

public class InvestidorAgressivo implements iEstrategia {
    @Override
    public void investir() {
        System.out.println("Todo o dinheiro foi investido!");
    }
}
