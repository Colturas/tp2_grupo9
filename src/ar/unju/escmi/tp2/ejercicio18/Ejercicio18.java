package ar.unju.escmi.tp2.ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = 1000;

        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("Las referencias son iguales");
        } else {
            System.out.println("Las referencias NO son iguales");
        }

        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("Los valores NO son iguales");
        }

        // Cambiando el valor de num2
        num2 = 3000;
        System.out.println("\nCambiando el valor de num2 a 3000:");
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("Las referencias son iguales");
        } else {
            System.out.println("Las referencias NO son iguales");
        }

        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("Los valores NO son iguales");
        }
    }
}