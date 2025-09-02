package ar.unju.escmi.tp2.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Nombres y apellidos
        String nombre1 = "María Diaz";
        String nombre2 = "Juan Gonzalez";
        String nombre3 = "Julieta Velazquez";
        String nombre4 = "Silvia Juarez";
        // Documentos
        int dni1 = 45200145;
        int dni2 = 44120789;
        int dni3 = 42001796;
        int dni4 = 43100789;

        // Mostrar datos de cada integrante en una sola línea por persona
        System.out.println(
            nombre1 + " - " + dni1 + "\n" +
            nombre2 + " - " + dni2 + "\n" +
            nombre3 + " - " + dni3 + "\n" +
            nombre4 + " - " + dni4
        );
    }
}