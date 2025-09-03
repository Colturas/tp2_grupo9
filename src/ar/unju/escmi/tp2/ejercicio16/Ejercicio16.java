package ar.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamaño;
        

        // Solicitar número en el rango [5,10]
        do {
            System.out.print("Ingrese el tamaño del array (entre 5 y 10): ");
            tamaño = scanner.nextInt();
        } while (tamaño < 5 || tamaño > 10);

        String[] nombres = new String[tamaño];
        scanner.nextLine(); // Limpiar buffer

        // Solicitar nombres para el array
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el nombre para la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar valores desde el primer índice
        System.out.println("Nombres ingresados (índice 0 al último):");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Índice " + i + ": " + nombres[i]);
        }

        // Mostrar valores desde el último índice
        System.out.println("Nombres ingresados (último índice al 0):");
        for (int i = tamaño - 1; i >= 0; i--) {
            System.out.println("Índice " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}