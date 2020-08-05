import java.util.Scanner;
public class URI1151 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N, fib, fib_anterior,temp;
        fib_anterior = 0;
        fib = 0;
        N = teclado.nextInt();
        for (int i = 0; i < N; i++) {
            if (i==0){
                fib = 0;
                fib_anterior = 0;
            }else if (i == 1){
                fib = 1;
            }else if (i == 2){
                fib = 1;
                fib_anterior = 1;
            }else{
                temp = fib;
                fib = fib + fib_anterior ;
                fib_anterior = temp;
            }
            if (i == N-1){
                System.out.println(fib);
            }else{
                System.out.print(fib + " ");
            }
            
        }
    }
}