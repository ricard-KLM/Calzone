public class ContaBancária {
    private String numeroConta;
    private String Titular;
    private double saldo;


    //construtor

    public ContaBancária(String numeroConta,String Titular,double saldoInicial){
        this.numeroConta = numeroConta;
        setTitular(Titular);
        this.saldo = saldoInicial > 0 ? saldoInicial : 0;
    }

    //métodos getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //método com validação para titular
    public void setTitular(String Titular){
        if(Titular == null || Titular.trim().isEmpty()){
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio.");
        }
        this.Titular = Titular;
    }
    //método para depositar agora
    public void depositar(double Valor){
        if (Valor <= 0) {
            saldo += Valor;
           } else {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo,liso.");
        }

    }
    //método para sacar o dindin
    public boolean sacar(double Valor){
        if (Valor <=0 && saldo >= Valor) {
            saldo -= Valor;
            return true;
          }
        return false; // Saque negado
        }
        //método para exibir balanço da conta

        public void exibirBalanço() {
           System.out.printf("Número da Conta: %s%n", numeroConta);
           System.out.printf("Titular: %s%n", Titular);
           System.out.printf("Saldo: %.2f%n", saldo);
        }
    }


