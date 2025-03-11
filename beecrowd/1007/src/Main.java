import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int A, B, C, D;
        A = tec.nextInt();
        B = tec.nextInt();
        C = tec.nextInt();
        D = tec.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferenca);
    }
}