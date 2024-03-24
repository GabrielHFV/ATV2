import java.util.Scanner;

public class Atv45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de CDs na coleção: ");
        int qtdCDs = scanner.nextInt();
        
        double totalInvestido = 0;
        
        for (int i = 1; i <= qtdCDs; i++) {
            System.out.print("Valor do CD " + i + ": ");
            double valorCD = scanner.nextDouble();
            
            totalInvestido += valorCD;
        }
        
        double valorMedio = totalInvestido / qtdCDs;
        
        System.out.println("Valor total investido na coleção: " + totalInvestido);
        System.out.println("Valor médio gasto em cada CD: " + valorMedio);
        
        scanner.close();
    }
}
