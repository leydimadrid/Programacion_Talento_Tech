/*
Este programa lee un número de 1 al 255 y muestra que carácter corresponde a su código ASCII
 */

/*
@autor: Leydi Madrid
@fecha: 24/09/2024
 */


package entradasprocesossalidas;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class CodigoAscii {
    public static void main(String[] args) {

        //Declarar variables
        int number = 1;
        char caracter;

        System.out.println("\n---- CÓDIGO ASCII  ----");

        //Entradas
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("\nIngrese un número entre el 1 y el 255: ");
            number = teclado.nextInt();
        } while (number < 1 || number > 255);


        //Procesos
        caracter = codigoAscii(number);

        //Salidas
        System.out.print("El carácter que corresponde a " + number + " es: " + caracter);

    }

    public static char codigoAscii(int number) {
        return (char) number;
    }
}
