import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int idadeEmDias = tec.nextInt();
        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30; // 1 mes = 30 dias
        int dias = (idadeEmDias % 365) % 30;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}