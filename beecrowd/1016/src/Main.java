import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int distancia = tec.nextInt();

        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");
    }
}