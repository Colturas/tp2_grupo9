package ar.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del radio del círculo (byte): ");
        byte radio = scanner.nextByte();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}