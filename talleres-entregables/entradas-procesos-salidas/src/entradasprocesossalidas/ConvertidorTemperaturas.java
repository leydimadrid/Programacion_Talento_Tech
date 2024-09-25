/* Este Programa permite recibir una temperatura y convertirla de Celsius a Fahrenheit o Fahrenheit a Celsius,
según la opción escogida*/

/*
@autor: Leydi Madrid
@fecha: 24/09/2024
 */


package entradasprocesossalidas;

import java.util.Scanner;

public class ConvertidorTemperaturas {
    public static void main(String[] args) {
        //Declarar variables
        int temperatura;
        int opcion;

        System.out.println("\n---- CONVERTIDOR DE TEMPERATURAS ----\n");


        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n--- OPCIONES ---");
        System.out.println("Elige 1 para convertir de Celsius a Fahrenheit");
        System.out.println("Elige 2 para convertir de Fahrenheit a Celsius");
        opcion = teclado.nextInt();
        System.out.print("\nIngrese la temperatura: ");
        temperatura = teclado.nextInt();

        //Procesos
        if (opcion == 1) {
            float resultado = celsiusAfahrenheit(temperatura);
            //Salida
            resultadoCelsiusaFahrenheit(resultado);


        } else if (opcion == 2) {
            float resultado = fahrenheitACelsius(temperatura);
            //Salida
            resultadoFahrenheitaCelsius(resultado);

        }

    }

    public static int celsiusAfahrenheit(int temperatura) {
        return (temperatura * 9 / 5) + 32;
    }

    //
    public static int fahrenheitACelsius(int temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    public static void resultadoFahrenheitaCelsius(float resultado) {
        System.out.println("El resultado es " + resultado + "°C");
    }

    public static void resultadoCelsiusaFahrenheit(float resultado) {
        System.out.println("El resultado es " + resultado + "°F");
    }
}
