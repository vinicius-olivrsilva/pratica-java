import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        final double PI = 3.14159;
        double raio = tec.nextDouble();
        double volume = (4.0/3) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume);
    }
}