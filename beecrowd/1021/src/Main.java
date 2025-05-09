import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double valor = tec.nextDouble();

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS: ");
        for (int nota : notas){
            int quantidade = (int) (valor / nota);
            System.out.println(quantidade + " nota(s) de R$ " + nota + ".00");
            valor = valor % nota;
            System.out.println("VALOR: " + valor);
        }

        System.out.println("MOEDAS: ");
        for (double moeda : moedas) {
            double valorDecimal = valor - Math.floor(valor);
            int quantidade = (int) (valorDecimal / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda );
            valor = valorDecimal % moeda;
        }
    }
}