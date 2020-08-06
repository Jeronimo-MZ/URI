import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, num;
        N = teclado.nextInt();
        for (int i = 0; i < N; i++) {
            num = teclado.nextInt();
            if (num % 2 == 0) {
                if (num < 0) {
                    System.out.println("EVEN NEGATIVE");
                } else if (num > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("NULL");
                }
            } else {
                if (num < 0) {
                    System.out.println("ODD NEGATIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }
        }
        teclado.close();
    }
}
