import java.util.Scanner;

public class IdentificadorDados { public static void main (String[] args)
{
    Scanner entrada;
    entrada = new Scanner(System.in);

    String nome;
    int idade,TempoIdade;
    double altura,AlturaCalculada;


    System.out.println("Qual o seu nome ?");
    nome = entrada.nextLine();

    System.out.println("Qual a sua idade ?");
    idade = entrada.nextInt();

    System.out.println("Qual a sua altura ?");
    altura = entrada.nextDouble();

    System.out.println("Seja bem vindo(a), " + nome + "!");

    TempoIdade = 50 - idade;

    System.out.println("Em " + TempoIdade + " ano(s) você terá 50 anos");

    AlturaCalculada = altura *100;

    System.out.println("Sua altura calculada em cm é " + AlturaCalculada + " centímetros");


    entrada.close();
}


}

