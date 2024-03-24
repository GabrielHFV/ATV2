import java.util.Scanner;

public class Atv43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        int[] votosCandidatos = new int[5]; // Considerando 5 candidatos (0 para índice vazio)
        int votosNulos = 0;
        int votosBrancos = 0;
        
        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ":");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.println("4 - Candidato 4");
            System.out.println("5 - Candidato 5");
            System.out.println("6 - Voto Nulo");
            System.out.println("7 - Voto em Branco");
            System.out.print("Digite o número correspondente ao voto: ");
            int voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    votosCandidatos[voto]++;
                    break;
                case 6:
                    votosNulos++;
                    break;
                case 7:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto inválido.");
            }
        }
        
        System.out.println("Resultado da Eleição:");
        for (int i = 1; i < votosCandidatos.length; i++) {
            System.out.println("Candidato " + i + ": " + votosCandidatos[i] + " votos");
        }
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosBrancos);
        
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        
        System.out.println("Percentual de Votos Nulos: " + percentualNulos + "%");
        System.out.println("Percentual de Votos em Branco: " + percentualBrancos + "%");
        
        scanner.close();
    }
}
