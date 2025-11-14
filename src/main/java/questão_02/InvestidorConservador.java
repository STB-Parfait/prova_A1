package questão_02;

public class InvestidorConservador implements iEstrategia {
    @Override
    public void investir() {
        System.out.println("10% do valor em conta foi investido!");
    }
}
