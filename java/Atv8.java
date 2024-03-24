import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / 5.0;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}
