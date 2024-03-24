import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
        scanner.close();
    }
}
