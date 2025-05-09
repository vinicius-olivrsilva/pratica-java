import java.util.Scanner;

public class MainGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100); // Converter para centavos para evitar problemas de precisão

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1}; // Moedas em centavos

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = centavos / (nota * 100);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double) nota);
            centavos %= (nota * 100);
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = centavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
            centavos %= moeda;
        }

        scanner.close();
}}
