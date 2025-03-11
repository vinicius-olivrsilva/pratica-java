import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double A,B,C;
        final double PI = 3.14159;

        A = tec.nextDouble();
        B = tec.nextDouble();
        C = tec.nextDouble();

        double trianguloRetangulo = (A * C) / 2;
        double circulo = PI * Math.pow(C,2);
        double trapezio = ((A+B)*C)/2;
        double quadrado = Math.pow(B,2);
        double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n",  trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

//      Saída formatada com um único print
//        System.out.print(
//            String.format("TRIANGULO: %.3f%n", trianguloRetangulo) +
//            String.format("CIRCULO: %.3f%n", circulo) +
//            String.format("TRAPEZIO: %.3f%n", trapezio) +
//            String.format("QUADRADO: %.3f%n", quadrado) +
//            String.format("RETANGULO: %.3f%n", retangulo)
//        );
    }
}