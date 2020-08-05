// sequencia de fibonacci
import java.util.Scanner;

public class URI1176 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        final int T;
        int N;
        long fib;
        T = teclado.nextInt();
        for (int i = 0; i < T; i++){
            N = teclado.nextInt();
            fib = fibonacci(N);
            System.out.println("Fib(" + N + ") = " + fib);
        }
        
    }

    static long fibonacci(int N){
        long fib, fib_anterior;
        fib = 0;
        fib_anterior = 1; // apartir do caso N = 3
        for (int i = 0; i <= N; i++) {
            if (i==0){
                fib = 0;
            }else if (i == 1 || i == 2){
                fib = 1;
            }else{
                fib = fib + fib_anterior ;
                fib_anterior = fib - fib_anterior;
            }
        }
        return fib;

    }
}