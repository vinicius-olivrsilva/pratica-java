import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int N = tec.nextInt(); // Lê o valor inteiro
        System.out.println(N); // Exibe o valor lido

        int[] notas = {100, 50, 20, 10, 5, 2, 1}; // Notas disponíveis

        for (int nota : notas) {
            int quantidade = N / nota; // Calcula quantas notas dessa são necessárias
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            N %= nota; // Atualiza o valor restante
        }

        tec.close();
    }
}
