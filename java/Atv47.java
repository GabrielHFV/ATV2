import java.util.Scanner;

public class Atv47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Preço do pão: R$ ");
        double precoPao = scanner.nextDouble();
        
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            double preco = i * precoPao;
            System.out.println(i + " - R$ " + preco);
        }
        
        scanner.close();
    }
}
