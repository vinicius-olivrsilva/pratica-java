import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int codigoPecaUm = tec.nextInt();
        int numeroPecaUm = tec.nextInt();
        double  valorUnitarioPecaUm = tec.nextDouble();

        int codigoPecaDois = tec.nextInt();
        int numeroPecaDois = tec.nextInt();
        double  valorUnitarioPecaDois = tec.nextDouble();

        double valorPago = (numeroPecaUm * valorUnitarioPecaUm) + (numeroPecaDois * valorUnitarioPecaDois);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPago);
    }
}