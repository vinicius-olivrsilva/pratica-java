import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        final double KmPorLitro = 12.0;
        int tempoEmHoras = tec.nextInt();
        int velocidadeMedia = tec.nextInt();

        int distanciaEmKm = velocidadeMedia * tempoEmHoras;
        double litros = distanciaEmKm / KmPorLitro;

        System.out.printf("%.3f\n", litros);
    }
}