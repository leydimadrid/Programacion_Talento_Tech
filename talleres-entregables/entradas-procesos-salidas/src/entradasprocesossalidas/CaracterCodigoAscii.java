/*
Este programa lee un carácter y muestra su código ASCII
 */

/*
@autor: Leydi Madrid
@fecha: 24/09/2024
 */


package entradasprocesossalidas;

import java.util.Scanner;

public class CaracterCodigoAscii {
    public static void main(String[] args) {

        //Declarar variables
        char caracter;
        int number;

        System.out.println("\n---- CÓDIGO ASCII DE UN CARÁCTER ----");
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIngrese un carácter: ");
        caracter = teclado.next().charAt(0);

        //Procesos
        number = codigoAscii(caracter);

        //Salidas
        System.out.print("El código ASCII de " + caracter + " es: " + number);

    }

    public static char codigoAscii(char caracter) {
        return caracter;
    }
}
