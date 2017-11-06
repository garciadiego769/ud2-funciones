package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int perimetrorectangulo(int base, int altura) {
        int area=base*altura;

        return area;
    }
    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce base:");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Introduce la altura:");
        int a=Integer.parseInt(br.readLine());

        /* llamamos a la función */

        System.out.println("El area es: " +perimetrorectangulo(a,b));
    }
}
