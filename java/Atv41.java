import java.util.Scanner;

public class Atv41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de notas: ");
        int quantidade = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Informe a nota " + i + ": ");
            double nota = scanner.nextDouble();
            
            soma += nota;
        }
        
        double media = soma / quantidade;
        
        System.out.println("Média aritmética das notas: " + media);
        
        scanner.close();
    }
}
