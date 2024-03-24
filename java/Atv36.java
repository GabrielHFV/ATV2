import java.util.Scanner;

public class Atv36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n para a série de Fibonacci: ");
        int n = scanner.nextInt();
        
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
        scanner.close();
    }
}
