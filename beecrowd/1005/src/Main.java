import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double A = tec.nextDouble();
        double B = tec.nextDouble();
        double media = ((A*3.5) + (B*7.5))/11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
