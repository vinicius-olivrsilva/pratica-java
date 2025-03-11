import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        float x1 = tec.nextFloat();
        float y1 = tec.nextFloat();
        float x2 = tec.nextFloat();
        float y2 = tec.nextFloat();

        double distanciaDoisPonto = Math.sqrt(Math.pow(x2-x1,2) +
                Math.pow(y2-y1,2));
        System.out.printf("%.4f\n", distanciaDoisPonto);
    }
}