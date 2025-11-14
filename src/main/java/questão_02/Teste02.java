package questão_02;

public class Teste02 {
    public static void main(String[] args) {

        Context contexto = new Context(new InvestidorAgressivo());
        //contexto.setEstrategia(new InvestidorConservador());

        contexto.executarEstrategia();
    }
}
