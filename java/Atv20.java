import java.util.Scanner;

public class Atv20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean primo = true;
        
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    System.out.println(numero + " não é um número primo.");
                    System.out.println("É divisível por " + i + ".");
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println(numero + " é um número primo.");
        }
        
        scanner.close();
    }
}
