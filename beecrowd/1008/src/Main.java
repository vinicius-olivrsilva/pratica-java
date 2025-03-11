import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int id = tec.nextInt();
        int horas = tec.nextInt();
        float salarioHora = tec.nextFloat();
        double salarioTotal = horas * salarioHora;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f", salarioTotal);
    }
}