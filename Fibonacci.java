import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }

        if (c == n) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
    }
}
