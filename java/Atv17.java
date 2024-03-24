import java.util.Scanner;

public class Atv17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja digitar? ");
        int quantidade = scanner.nextInt();
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        
        for (int i = 1; i <= quantidade; i++) {
            int numero;
            do {
                System.out.print("Digite o número " + i + " (entre 0 e 1000): ");
                numero = scanner.nextInt();
            } while (numero < 0 || numero > 1000);
            
            soma += numero;
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
        scanner.close();
    }
}
