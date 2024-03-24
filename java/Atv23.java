import java.util.Scanner;

public class Atv23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas pessoas na turma? ");
        int quantidade = scanner.nextInt();
        
        int somaIdades = 0;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            
            somaIdades += idade;
        }
        
        double mediaIdades = (double) somaIdades / quantidade;
        
        System.out.println("Média de idade da turma: " + mediaIdades);
        
        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("A turma é jovem.");
        } else if (mediaIdades > 25 && mediaIdades <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
        
        scanner.close();
    }
}
