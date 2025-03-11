import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int fator1 = tec.nextInt();
        int fator2 = tec.nextInt();
        int prod = fator1 * fator2;

        System.out.println("PROD = " + prod);
    }
}
