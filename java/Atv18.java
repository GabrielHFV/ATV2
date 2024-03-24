import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número inteiro (limite: 16): ");
            int numero = scanner.nextInt();
            
            if (numero < 0 || numero > 16) {
                System.out.println("Número inválido. O número deve ser positivo e menor ou igual a 16.");
                continue;
            }
            
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
            
            System.out.print("Deseja calcular outro fatorial? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }
        
        scanner.close();
    }
}
