package ar.unju.escmi.tp2.ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        int a = 30;
        double b = 1.5;

        System.out.println(a++); // Imprime 30, luego a = 31
        System.out.println(a);   // Imprime 31
        System.out.println(--a); // Resta 1 antes de imprimir, imprime 30

        System.out.println(++b); // Suma 1 antes de imprimir, imprime 2.5
        System.out.println(b--); // Imprime 2.5, luego b = 1.5
        System.out.println(b);   // Imprime 1.5
    }
}