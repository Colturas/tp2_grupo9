package ar.unju.escmi.tp2.ejercicio1;

public class Ejercicio2 {
    public static void main(String[] args) {
        String frase = "La educación es el arma más poderosa que puedes usar para cambiar el mundo.";

        // Mostrar la frase original
        System.out.println("Frase original:");
        System.out.println(frase);

        // Longitud de la frase
        System.out.println("\nLongitud de la frase: " + frase.length());

        // Frase en mayúsculas
        System.out.println("\nFrase en mayúsculas:");
        System.out.println(frase.toUpperCase());

        // Frase en minúsculas
        System.out.println("\nFrase en minúsculas:");
        System.out.println(frase.toLowerCase());

        // Primer carácter
        System.out.println("\nPrimer carácter de la frase: " + frase.charAt(0));

        // Último carácter
        System.out.println("Último carácter de la frase: " + frase.charAt(frase.length() - 1));

        // Subcadena: desde la palabra "arma" hasta "poderosa"
        int inicio = frase.indexOf("arma");
        int fin = frase.indexOf("poderosa") + "poderosa".length();
        String subcadena = frase.substring(inicio, fin);
        System.out.println("\nSubcadena seleccionada: " + subcadena);
    }
}