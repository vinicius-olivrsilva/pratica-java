import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int X = tec.nextInt();
        float Y = tec.nextFloat();

        double consumoMedio = X/Y;
        System.out.printf("%.3f km/l%n", consumoMedio);
    }
}