import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();


        int maiorAB = ((A+B+Math.abs(A-B)))/2;
        int maior = ((maiorAB+C+Math.abs(maiorAB-C)))/2;

        System.out.println(Math.abs(maior) + " eh o maior");
    }
}