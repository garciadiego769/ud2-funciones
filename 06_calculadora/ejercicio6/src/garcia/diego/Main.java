package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(double numero) {
        return 2 * Math.PI* numero;
    }

    public static double area(double numero) {
        return Math.PI * Math.pow(numero,2);
    }

    public static double volumen(double numero) {
        return  4/3 * Math.PI * Math.pow(numero,3);
    }


    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;
        double numero=0;


        do {

            System.out.println("``` \n" +
                    "=== Calculadora === \n" +
                    "a) Longitud de la circunferencia \n" +
                    "b) Área del círculo \n" +
                    "c) Volumen de la esfera \n" +
                    "d) Salir \n" +
                    "Opción: \n" +
                    "``` ");
            opcion = br.readLine().charAt(0);

            if(opcion=='a' || opcion=='b' || opcion=='c') {
                System.out.println("Introduce radio(r):");
                numero = Double.parseDouble(br.readLine());

                switch (opcion) {
                    case 'a':
                        System.out.println("El perimetro de " + numero + " es :");
                        System.out.println(longitud(numero));
                        break;
                    case 'b':
                        System.out.println("El area de " + numero + " es :");
                        System.out.println(area(numero));
                        break;
                    case 'c':
                        System.out.println("El volumen de " + numero + " es :");
                        System.out.println(volumen(numero));
                        break;
                    default:
                        System.out.println("Opción errónea");
                        break;
                }
            }

        } while (opcion != 'd');



    }
}
