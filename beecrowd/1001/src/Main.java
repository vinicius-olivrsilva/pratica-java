import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int A = tec.nextInt();
        System.out.println("Digite o segundo valor: ");
        int B = tec.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
    }
}