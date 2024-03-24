public class Atv49 {
    public static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;
        
        System.out.println("Série de Fibonacci até o valor ser maior que 500:");
        while (termo1 <= 500) {
            System.out.print(termo1 + " ");
            int soma = termo1 + termo2;
            termo1 = termo2;
            termo2 = soma;
        }
    }
}
