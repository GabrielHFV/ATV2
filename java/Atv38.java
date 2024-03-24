import java.util.Scanner;

public class Atv38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número inteiro (limite máximo: 15, -1 para sair): ");
            int numero = scanner.nextInt();
            
            if (numero == -1) {
                break;
            }
            
            if (numero < 0 || numero > 15) {
                System.out.println("Número inválido! Digite um número inteiro entre 0 e 15.");
                continue;
            }
            
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            
            System.out.println("Fatorial de " + numero + "! = " + fatorial);
        }
        
        scanner.close();
    }
}
