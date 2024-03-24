import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Números entre " + num1 + " e " + num2 + ":");
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }

        int soma = 0;
        for (int i = num1 + 1; i < num2; i++) {
            soma += i;
        }
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
