package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /* recursivo */
    public static int calcularfibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return calcularfibonacci(n - 1) + calcularfibonacci(n - 2);
        }

    }

    /* iterativo*/
    public static int calcularfibonacci2(int n) throws IOException {
        int num1 = 0;
        int num2 = 1;
        int calculo = 0;

        for (int i = 0; i < n; i++) {
            calculo = num2 + num1;
            num1 = num2;
            num2 = calculo;
        }
        return num1;
    }

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        System.out.println("Introduce nº: ");
        numero = Integer.parseInt(br.readLine());

        System.out.println(calcularfibonacci2(numero));

    }
}
