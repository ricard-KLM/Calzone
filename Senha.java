import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha = "";

        while (!senha.equals("Java21")) {
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();
        }

        System.out.println("Acesso permitido");
        entrada.close();
    }
}
