import java.util.Scanner;

public class Atv22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas notas deseja informar? ");
        int quantidade = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            
            soma += nota;
        }
        
        double media = soma / quantidade;
        
        System.out.println("Média aritmética das notas: " + media);
        
        scanner.close();
    }
}

