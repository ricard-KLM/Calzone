public class AplicacaoBanco {

    public static void main(String[] args) {

        //Criar objeto banco

        Banco banco = new Banco();


        banco.adicionarConta(new ContaBancária("007", "Patrick Estrela", 500.00));
        banco.adicionarConta(new ContaBancária("008", "Cosmo", 1000.00));
        banco.adicionarConta(new ContaBancária("009", "Tony Stark", 000.50));

        //Dépositos
        banco.buscarConta("007").depositar(6000.00); //patrick botou os 6k q ganhou na bet
        banco.buscarConta("008").depositar(5000.00); // cosmo depositou a pensão da puff

        //Saques
        banco.buscarConta("007").sacar(1000.00); // patrick sacou 1k pra dar entrada no carro
        banco.buscarConta("008").sacar(2000.00); // cosmo sacou 2k pra pagar o agiota


        //Caso o saque for negado
          if (!banco.buscarConta("009").sacar(1000.00)) {
            System.out.println("Saque negado, saldo insuficiente, pobre.");
          }

          //exibir contas
        banco.listarContas();
    }
}
