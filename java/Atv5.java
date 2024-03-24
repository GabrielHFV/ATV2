import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        
        while (repetir) {
            int populacaoA = obterValorPositivo(scanner, "população do país A");
            double taxaCrescimentoA = obterValorPositivoDouble(scanner, "taxa de crescimento do país A");

            int populacaoB = obterValorPositivo(scanner, "população do país B");
            double taxaCrescimentoB = obterValorPositivoDouble(scanner, "taxa de crescimento do país B");

            int anos = calcularAnos(populacaoA, taxaCrescimentoA, populacaoB, taxaCrescimentoB);

            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse a população do país B.");

            System.out.print("Deseja repetir a operação? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                repetir = false;
            }
        }

        scanner.close();
    }

    public static int obterValorPositivo(Scanner scanner, String descricao) {
        int valor;
        do {
            System.out.print("Digite a " + descricao + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, digite um número válido: ");
                scanner.next();
            }
            valor = scanner.nextInt();
            if (valor <= 0) {
                System.out.println("O valor deve ser positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    public static double obterValorPositivoDouble(Scanner scanner, String descricao) {
        double valor;
        do {
            System.out.print("Digite a " + descricao + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Por favor, digite um número válido: ");
                scanner.next();
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("O valor deve ser positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    public static int calcularAnos(int populacaoA, double taxaCrescimentoA, int populacaoB, double taxaCrescimentoB) {
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            anos++;
        }
        return anos;
    }
}
