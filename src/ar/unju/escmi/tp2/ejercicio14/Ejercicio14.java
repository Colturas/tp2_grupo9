package ar.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Índice y valor almacenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}