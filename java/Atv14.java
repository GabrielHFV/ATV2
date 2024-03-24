public class Atv14 {
    public static void main(String[] args) {
        int primeiroTermo = 0, segundoTermo = 1, proximoTermo = 0;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
        System.out.print(primeiroTermo + ", " + segundoTermo + ", ");

        while (proximoTermo <= 500) {
            proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + ", ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
