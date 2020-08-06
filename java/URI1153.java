import java.util.Scanner;
public class URI1153 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i <= N; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        teclado.close();
    }
}
