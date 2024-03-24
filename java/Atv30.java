import java.util.Scanner;

public class Atv30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio da lata de óleo (em cm): ");
        double raio = scanner.nextDouble();
        
        System.out.print("Digite a altura da lata de óleo (em cm): ");
        double altura = scanner.nextDouble();
        
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        
        System.out.println("Volume da lata de óleo: " + volume + " cm³");
        
        scanner.close();
    }
}


