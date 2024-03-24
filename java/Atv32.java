import java.util.Scanner;

public class Atv32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de temperaturas a serem informadas: ");
        int quantidade = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Informe a temperatura " + i + " (em °C): ");
            double temperatura = scanner.nextDouble();
            
            soma += temperatura;
        }
        
        double media = soma / quantidade;
        
        System.out.println("Média das temperaturas informadas: " + media + " °C");
        
        scanner.close();
    }
}
