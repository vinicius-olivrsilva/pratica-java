import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int A, B;
        A = tec.nextInt();
        B = tec.nextInt();

        int soma = A + B;

        System.out.printf("SOMA = %d\n", soma);
    }
}