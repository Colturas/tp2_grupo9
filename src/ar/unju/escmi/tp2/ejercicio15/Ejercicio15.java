package ar.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamaño;

        // Solicitar número en el rango [3,10]
        do {
            System.out.print("Ingrese el tamaño del array (entre 3 y 10): ");
            tamaño = scanner.nextInt();
        } while (tamaño < 3 || tamaño > 10);

        int[] numeros = new int[tamaño];
        int suma = 0;

        // Solicitar valores para el array
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        // Mostrar valores y suma
        System.out.println("Valores del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        System.out.println("Suma de todos los valores: " + suma);

        scanner.close();
    }
}
