package ar.unju.escmi.tp2.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num = 3;
        int resultadoIntermedio = num * (num + 1) / 2;
        double resultadoFinal = Math.pow(resultadoIntermedio, 2);
        

        System.out.println("Para num = " + num + ":");
        System.out.println("El resultado de (num * (num + 1) / 2)^2 es: " + resultadoFinal);
    }
}