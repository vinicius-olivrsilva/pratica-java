import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double A = tec.nextDouble();
        double B = tec.nextDouble();
        double C = tec.nextDouble();

        double media = ((A*2) + (B*3) + (C*5))/10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
