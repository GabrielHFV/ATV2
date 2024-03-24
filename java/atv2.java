import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            while (senha.equals(nome)) {
                System.out.println("A senha deve ser diferente do nome");
                System.out.print("Digite uma nova senha: ");
                senha = scanner.nextLine();
            }

            if (!senha.equals(nome)) {
                System.out.println("Acabou!");
            }
        } finally {
            // Fechando o Scanner para liberar os recursos do sistema
            scanner.close();
        }
    }
}

