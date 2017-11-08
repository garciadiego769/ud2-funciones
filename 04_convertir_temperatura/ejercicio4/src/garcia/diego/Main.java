package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double grados){
        double conversion=(grados*1.8)+32;
        return conversion;
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double grados;

        System.out.println("Introduce grados Cº a convertir: ");
        grados=Double.parseDouble(br.readLine());

        System.out.println(grados+"º C son "+convertirTemperatura(grados)+"º Fahrenheit");
    }
}
