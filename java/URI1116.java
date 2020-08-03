import java.util.Scanner;
public class URI1116 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, x, y;
        N = teclado.nextInt();
        for (int i = 0; i < N; i++){

            x = teclado.nextInt();
            y = teclado.nextInt();
            if (y != 0){
                System.out.printf("%.1f\n", ((float)x/y));
            } else{
                System.out.println("divisao impossivel");
            }
        }
    }
}