import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos desejado: ");
        int n = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;
        System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(primeiroTermo + ", ");
            int soma = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = soma;
        }

        scanner.close();
    }
}
