import java.util.Scanner;

public class MainGpt {
        // Constante para a mensagem
        private static final String MENSAGEM = "eh o maior";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                // Lendo os três valores inteiros
                int a = lerInteiro(scanner, "Digite o primeiro valor: ");
                int b = lerInteiro(scanner, "Digite o segundo valor: ");
                int c = lerInteiro(scanner, "Digite o terceiro valor: ");

                // Encontrar o maior valor entre os três
                int maior = calcularMaior(a, b, c);

                // Exibindo o maior número seguido da mensagem
                System.out.println(maior + " " + MENSAGEM);

            } catch (Exception e) {
                System.out.println("Erro na entrada. Por favor, insira valores válidos.");
            } finally {
                scanner.close();
            }
        }

        // Método para ler um número inteiro com validação simples
        private static int lerInteiro(Scanner scanner, String mensagem) {
            System.out.print(mensagem);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Descartar a entrada inválida
            }
            return scanner.nextInt();
        }

        // Método para calcular o maior entre três números
        private static int calcularMaior(int a, int b, int c) {
            // Calculando o maior entre os dois primeiros números (a e b)
            int maiorAB = (a + b + Math.abs(a - b)) / 2;

            // Calculando o maior entre o maior de a e b e o terceiro número c
            return (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        }
    }