package ar.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        scanner.close();