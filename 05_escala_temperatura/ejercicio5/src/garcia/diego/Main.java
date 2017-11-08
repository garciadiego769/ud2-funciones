package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static double convertirTemperatura(int escala, double grados) {
        double conversion = 0;
        if (escala == 1) {
            conversion = (grados * 1.8) + 32;
        } else if (escala == 2) {
            conversion = (grados + 273.15);
        }
        return conversion;
    }

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double grados;
        int opcion;
        System.out.println("=== Temperaturas === \n" +
                "1. Convertir a Fahrenheit \n" +
                "2. Convertir a Kelvin \n" +
                "3. Salir \n" +
                "Opción: ");
        opcion = Integer.parseInt(br.readLine());

        while (opcion != 3) {

          System.out.println("Introduce grados a convertir: ");
            grados = Double.parseDouble(br.readLine());
            if (opcion == 1) {
                System.out.println(grados + "º C son " + convertirTemperatura(opcion, grados) + "º Fahrenheit");
            } else if (opcion == 2) {
                System.out.println(grados + "º C son " + convertirTemperatura(opcion, grados) + "º Kelvin");

            }

            System.out.println("=== Temperaturas === \n" +
                    "1. Convertir a Fahrenheit \n" +
                    "2. Convertir a Kelvin \n" +
                    "3. Salir \n" +
                    "Opción: ");
            opcion = Integer.parseInt(br.readLine());
        }
    }
}