import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
