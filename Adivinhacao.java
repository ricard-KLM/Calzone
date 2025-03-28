import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int palpite = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }

        entrada.close();
    }
}
