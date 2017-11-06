package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static double calcularcambio(double valor,String divisa){
        double cambio=0;
        switch(divisa){
            case "USD":
                cambio=valor*1.16;
            break;
            case "GBP":
                cambio=valor*0.88;
            break;
            case "CNY":
                cambio=valor*7.69;
            break;
            case "JPY":
                cambio=valor*132.14;
            break;
        }
        return cambio;
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double cantidad;
        String moneda;

        System.out.println("Introduzca una cantidad en euros: ");
        cantidad=Double.parseDouble(br.readLine());
        System.out.println("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        moneda=br.readLine();

        System.out.println(calcularcambio(cantidad,moneda));
    }

}
