package ar.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args) {
        String texto1 = "Hola";
        String texto2 = "Hola";
        String texto3 = new String("Hola");

        System.out.println("texto1 == texto2: " + (texto1 == texto2));
        System.out.println("texto1.equals(texto2): " + texto1.equals(texto2));

        System.out.println("texto1 == texto3: " + (texto1 == texto3));
        System.out.println("texto1.equals(texto3): " + texto1.equals(texto3));
    }
}