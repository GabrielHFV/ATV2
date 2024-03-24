import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);
        
        try {
            do {
                System.out.print("Digite uma nota entre zero e dez: ");
                nota = scanner.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Valor inválido! Por favor, digite novamente.");
                }
            } while (nota < 0 || nota > 10);

            System.out.println("Valor válido informado: " + nota);
        } finally {
            // Fechando o Scanner para liberar os recursos do sistema
            scanner.close();
        }
    }
}
