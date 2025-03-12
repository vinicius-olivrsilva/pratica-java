import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int tempo = tec.nextInt();
        int horas, minutos, segundos ;

        horas = tempo / 3600;
        minutos = (tempo % 3600) / 60;
        segundos = tempo % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        tec.close();
    }
}