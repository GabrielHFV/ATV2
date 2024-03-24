import java.util.Scanner;

public class Atv44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de turmas: ");
        int qtdTurmas = scanner.nextInt();
        
        int totalAlunos = 0;
        
        for (int i = 1; i <= qtdTurmas; i++) {
            System.out.print("Quantidade de alunos na turma " + i + ": ");
            int alunosTurma = scanner.nextInt();
            
            if (alunosTurma > 40) {
                System.out.println("Número de alunos excede o limite máximo de 40.");
                continue;
            }
            
            totalAlunos += alunosTurma;
        }
        
        double mediaAlunosPorTurma = (double) totalAlunos / qtdTurmas;
        
        System.out.println("Média de alunos por turma: " + mediaAlunosPorTurma);
        
        scanner.close();
    }
}
