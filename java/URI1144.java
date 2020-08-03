import java.util.Scanner;
public class URI1144 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int quadrado , cubo;
        int N = teclado.nextInt();
        for (int i = 1; i <= N; i++){
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%d %d %d\n", i, quadrado, cubo);
            System.out.printf("%d %d %d\n", i, ++quadrado, ++cubo);

        }
    }
}