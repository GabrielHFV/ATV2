import java.util.Scanner;

public class Atv24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        
        for (int i = 1; i <= totalEleitores; i++) {
            System.out.print("Voto do eleitor " + i + " (1, 2 ou 3): ");
            int voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido.");
            }
        }
        
        System.out.println("Total de votos do candidato 1: " + votosCandidato1);
        System.out.println("Total de votos do candidato 2: " + votosCandidato2);
        System.out.println("Total de votos do candidato 3: " + votosCandidato3);
        
        scanner.close();
    }
}
