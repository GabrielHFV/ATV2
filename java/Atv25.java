import java.util.Scanner;

public class Atv25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            double totalCompra = 0;
            
            System.out.println("Lojas Tabajara");
            System.out.println("Digite os valores das mercadorias (0 para finalizar): ");
            
            double valorMercadoria;
            while (true) {
                System.out.print("Valor da mercadoria: ");
                valorMercadoria = scanner.nextDouble();
                
                if (valorMercadoria == 0) {
                    break;
                }
                
                totalCompra += valorMercadoria;
            }
            
            System.out.println("Total da compra: R$ " + totalCompra);
            
            double valorPago;
            do {
                System.out.print("Valor pago: R$ ");
                valorPago = scanner.nextDouble();
                
                if (valorPago < totalCompra) {
                    System.out.println("Valor insuficiente. Digite um valor igual ou maior que o total da compra.");
                }
            } while (valorPago < totalCompra);
            
            double troco = valorPago - totalCompra;
            System.out.println("Troco: R$ " + troco);
            
            System.out.print("Deseja realizar outra compra? (S/N): ");
            String opcao = scanner.next();
            if (!opcao.equalsIgnoreCase("S")) {
                break;
            }
        }
        
        scanner.close();
    }
}
