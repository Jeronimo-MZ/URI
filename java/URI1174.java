import java.util.Scanner;
public class URI1174 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float N[] = new float[100];
        for (int i = 0; i < 100; i++) {
            N[i] = teclado.nextFloat();
        }
        for (int i = 0; i < 100; i++) {
            if (N[i] <=10){
                System.out.printf("A[%d] = %.1f\n", i,N[i]);
            }
        }
        teclado.close();
    }
}
