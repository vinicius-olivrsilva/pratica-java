import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nomeVendedor = tec.next();
        double salarioFixo = tec.nextDouble();
        double totalVendas = tec.nextDouble();

        double comissao = totalVendas*0.15;
        double salario = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salario);
    }
}