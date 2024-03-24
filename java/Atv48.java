import java.util.Scanner;

public class Atv48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            double totalCompra = 0;
            
            System.out.println("Lojas Tabajara");
            int contador = 1;
            while (true) {
                System.out.print("Produto " + contador + ": R$ ");
                double preco = scanner.nextDouble();
                
                if (preco == 0) {
                    break;
                }
                
                totalCompra += preco;
                contador++;
            }
            
            if (totalCompra == 0) {
                break;
            }
            
            System.out.println("Total: R$ " + totalCompra);
            
            double dinheiro;
            do {
                System.out.print("Dinheiro: R$ ");
                dinheiro = scanner.nextDouble();
                
                if (dinheiro < totalCompra) {
                    System.out.println("Dinheiro insuficiente. Por favor, insira um valor maior ou igual ao total da compra.");
                }
            } while (dinheiro < totalCompra);
            
            double troco = dinheiro - totalCompra;
            System.out.println("Troco: R$ " + troco);
        }
        
        scanner.close();
    }
}
