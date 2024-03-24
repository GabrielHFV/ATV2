public class Atv37 {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.print("Série de Fibonacci até que o valor seja maior que 500: ");
        
        while (primeiroTermo <= 500) {
            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
