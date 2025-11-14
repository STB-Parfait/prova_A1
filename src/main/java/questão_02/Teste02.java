package questão_02;

public class Teste02 {
    public static void main(String[] args) {

        //Foi usado o padrão estrategy pela necessidade
        //do sistema de poder alternar entre diferentes
        //estrtégias

        Context contexto = new Context(new InvestidorAgressivo());
        //contexto.setEstrategia(new InvestidorConservador());

        contexto.executarEstrategia();
    }
}
