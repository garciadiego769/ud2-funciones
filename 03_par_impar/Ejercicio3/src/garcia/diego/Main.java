package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String esPar(){
        String resultado="PAR";
        return resultado;
    }
    public static String esImpar(){
        String resultado="IMPAR";
        return resultado;
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero;

        System.out.println("Introduce nº: ");
        numero=Integer.parseInt(br.readLine());

        if(numero%2==0){
            System.out.println(esPar());
        }
        else{
            System.out.println(esImpar());
        }
    }
}
