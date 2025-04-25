import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancária> contas;

    //Construtor
    public Banco() {
        this.contas = new ArrayList<>();
    }

    //método para adicionar conta
    public void adicionarConta(ContaBancária conta){
        if (conta != null) {
            contas.add(conta);
         }  else {
            throw new IllegalArgumentException("A conta não pode ser nula, bocó.");
        }
    }

    //método para buscar conta pelo número

    public ContaBancária buscarConta(String numeroConta){
        for (ContaBancária conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null; // se a conta não for encontrada
    }

    //método para listar todas as contas registradas
    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhum conta cadastrada.");
        }  else {
            for (ContaBancária conta : contas) {
                conta.exibirBalanço();
                System.out.println("_______________________________");
            }
        }
    }
}
