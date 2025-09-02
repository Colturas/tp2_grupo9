package ar.unju.escmi.tp2.ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 2, d = 6;

        System.out.println("Valores iniciales:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        a += 5;
        b -= 2;
        c *= 3;
        d /= 2;

        System.out.println("\nValores después de usar los operadores de asignación:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 8
        System.out.println("c = " + c); // 6
        System.out.println("d = " + d); // 3
    }