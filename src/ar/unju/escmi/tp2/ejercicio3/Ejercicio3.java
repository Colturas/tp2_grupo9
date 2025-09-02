package ar.unju.escmi.tp2.ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else if (numero == 0) {
            System.out.println("El número es cero.");
        } else if (numero > 0 && numero <= 100) {
            System.out.println("El número es positivo y menor o igual a 100.");
        } else {
            System.out.println("El número es positivo y mayor a 100.");
        }

        scanner.close();
    }
}