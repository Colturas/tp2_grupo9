package ar.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 8, b = 3, c = -5;
        int resultadoA = a + b + c;
        int resultadoB = 2 * b + 3 * (a - c);
        double resultadoC = (double) a / b;
        int resultadoD = a % b;
        double resultadoE = (double) a / c;
        int resultadoF = a % c;
        double resultadoG = (double) (a * b) / c;
        int resultadoH = a * (b / c);
        int resultadoI = (a * c) % b;
        int resultadoJ = a * (c % b);
        int resultadoK = (3 * a - 2 * b) % (2 * a - c);
        int resultadoL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        double resultadoM = ((a - 3 * b) % (c + 2 * a)) / (double) (a - c);
        int resultadoN = a - b - c * 2;

        System.out.println("a) " + resultadoA);
        System.out.println("b) " + resultadoB);
        System.out.println("c) " + resultadoC);
        System.out.println("d) " + resultadoD);
        System.out.println("e) " + resultadoE);
        System.out.println("f) " + resultadoF);
        System.out.println("g) " + resultadoG);
        System.out.println("h) " + resultadoH);
        System.out.println("i) " + resultadoI);
        System.out.println("j) " + resultadoJ);
        System.out.println("k) " + resultadoK);
        System.out.println("l) " + resultadoL);
        System.out.println("m) " + resultadoM);
        System.out.println("n) " + resultadoN);
    }
}