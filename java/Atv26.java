import java.util.Scanner;

public class Atv26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de CDs na coleção: ");
        int quantidadeCDs = scanner.nextInt();
        
        double valorTotal = 0;
        
        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Valor do CD " + i + ": R$ ");
            double valorCD = scanner.nextDouble();
            
            valorTotal += valorCD;
        }
        
        double valorMedio = valorTotal / quantidadeCDs;
        
        System.out.println("Valor total investido na coleção: R$ " + valorTotal);
        System.out.println("Valor médio gasto em cada CD: R$ " + valorMedio);
        
        scanner.close();
    }
}
