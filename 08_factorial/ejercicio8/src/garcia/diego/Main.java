package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int calcularfactorial(int numero){
        int calculo=1;

        for (int i = 2; i <= numero; i++) {
            calculo=calculo*i;
        }
        return calculo;
    }

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero;


        System.out.println("Introduce nº:");
        numero=Integer.parseInt(br.readLine());

        System.out.println("El factorial de "+numero+" es "+calcularfactorial(numero));

    }


}
