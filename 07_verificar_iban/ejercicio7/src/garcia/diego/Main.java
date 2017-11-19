package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean verificarIban(String iban){

        /* Quitar los espacios */
        iban=iban.replaceAll("\\s","");

        /* Extraer los 4 primeros caracteres*/
        String cuatroprimeros=iban.substring(0,4);
        String restocadena=iban.substring(4);

        /* - convertir cualquier letra en número de acuerdo con la tabla estándar*/
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatroprimeros.charAt(0)) + 10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatroprimeros.charAt(1)) + 10;

        String nuevoIBAN = restocadena + numero1 + numero2 + cuatroprimeros.substring(2);
        /* - dividir entre 97 */
        long numero = Long.parseLong(nuevoIBAN);
      /* Si la respuesta es 1, el IBAN es válido. */
        return numero % 97 == 1;


    }
    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String iban;

        System.out.println("Introduce el nº IBAN: ");
        iban=br.readLine();

        if (verificarIban(iban)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }


    }


}
