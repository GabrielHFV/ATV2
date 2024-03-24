import java.util.Scanner;

public class Atv31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo (em cm): ");
        double raio = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("Área do círculo: " + area + " cm²");
        
        scanner.close();
    }
}
