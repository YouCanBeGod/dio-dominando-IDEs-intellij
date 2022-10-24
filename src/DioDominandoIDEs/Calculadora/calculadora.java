package DioDominandoIDEs.Calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = entrada.nextInt();

        int somar = somar(a, b);
        int sub = sub(a, b);
        int div = div(a, b);
        int mult = mult(a, b);

        System.out.printf("soma = %d, sub = %d, div = %d, mult = %d.", somar, sub, div, mult);

    }

    public static int somar (int a, int b) {
        return a + b;
    }
    public static int sub (int a, int b) {
        return a - b;
    }
    public static int div (int a, int b) {
        return a / b;
    }
    public static int mult (int a, int b) {
        return a * b;
    }
}
