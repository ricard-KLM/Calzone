import java.util.Scanner;

public class ControleNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Quantos alunos deseja cadastrar? ");
            int numAlunos = scanner.nextInt();
            scanner.nextLine();

            String[] nomes = new String[numAlunos];
            double[][] notas = new double[numAlunos][2];
            double somaNotas = 0;
            double maiorNota = Double.MIN_VALUE;
            double menorNota = Double.MAX_VALUE;
            int totalAprovados = 0;
            int totalRecuperacao = 0;
            int totalReprovados = 0;

            for (int i = 0; i < numAlunos; i++) {
                System.out.print("Aluno " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();

                for (int j = 0; j < 2; j++) {
                    while (true) {
                        System.out.print("Nota " + (j + 1) + ": ");
                        double nota = scanner.nextDouble();
                        if (nota >= 0 && nota <= 10) {
                            notas[i][j] = nota;
                            somaNotas += nota;
                            if (nota > maiorNota) maiorNota = nota;
                            if (nota < menorNota) menorNota = nota;
                            break;
                        } else {
                            System.out.println("Nota inválida, deve ser entre 0 e 10.");
                        }
                    }
                }
                scanner.nextLine();
            }

            System.out.println("\nResultados:");
            for (int i = 0; i < numAlunos; i++) {
                double media = (notas[i][0] + notas[i][1]) / 2;
                String status;
                if (media >= 7) {
                    status = "Aprovado";
                    totalAprovados++;
                } else if (media >= 5) {
                    status = "Recuperação";
                    totalRecuperacao++;
                } else {
                    status = "Reprovado";
                    totalReprovados++;
                }
                System.out.println(nomes[i] + " - Média: " + media + " - Status: " + status);
            }

            double mediaTurma = somaNotas / (numAlunos * 2);
            System.out.println("\nMédia da turma: " + mediaTurma);
            System.out.println("Maior nota registrada: " + maiorNota);
            System.out.println("Menor nota registrada: " + menorNota);
            System.out.println("Total de aprovados: " + totalAprovados);
            System.out.println("Total em recuperação: " + totalRecuperacao);
            System.out.println("Total de reprovados: " + totalReprovados);

            System.out.print("\nDeseja cadastrar uma nova turma? (S/N): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine();
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}