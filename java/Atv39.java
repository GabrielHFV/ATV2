import java.util.Scanner;

public class Atv39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean ehPrimo = true;
        
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    System.out.println(numero + " não é um número primo.");
                    System.out.println("É divisível por " + i + ".");
                    break;
                }
            }
        }
        
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        }
        
        scanner.close();
    }
}
