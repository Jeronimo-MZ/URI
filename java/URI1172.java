import java.util.Scanner;
public class URI1172 {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N[] = new int[10];
        for (int i = 0; i < 10; i++) {
            N[i] = teclado.nextInt();
            N[i] = (N[i] <=0) ? 1 : N[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d\n", i,N[i]);
        }
        teclado.close();
    }
}
