import java.util.Scanner;

public class Atv29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Valor da hora de trabalho: R$ ");
        double valorHora = scanner.nextDouble();
        
        double salario = horasTrabalhadas * valorHora;
        
        System.out.println("Salário do funcionário: R$ " + salario);
        
        scanner.close();
    }
}
