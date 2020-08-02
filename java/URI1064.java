import java.util.Scanner;
public class URI1064 {

    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int  positivos;
        float N, media;
        media = 0;
        positivos = 0;
        for (int i = 0; i < 6; i++) {
            N = teclado.nextFloat();
            if (N > 0) {
                positivos++;
                media += N;
            }
        }
        media /= positivos;
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n",media);
    }
}