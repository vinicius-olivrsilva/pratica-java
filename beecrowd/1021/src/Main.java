import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double valor = tec.nextDouble();
        int valorCentavos = (int) Math.round(valor * 100);

        System.out.println("Valor centavos: " + valorCentavos);

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas){
            int quantidade = valorCentavos / (nota * 100);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double) nota);
            valorCentavos = valorCentavos % (nota * 100);
        }
        System.out.println("VALOR: " + valorCentavos);

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = valorCentavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
            valorCentavos  = valorCentavos % moeda;
        }
    }
}