//import java.util.Scanner;
public class URI1177 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int T, X = 0;
        int N[] = new int[1000];
        T = teclado.nextInt();
        for (int i = 0; i < 1000; i++) {
            N[i] = X;
            X++;
            if (X == T){
                X = 0;
            }
        }
        for (int i = 0; i < 1000; i++){
            System.out.printf("N[%d] = %d\n",i,N[i]);
        }

        teclado.close();
    }
}