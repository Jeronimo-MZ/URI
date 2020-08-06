import java.util.Scanner;
public class URI1079 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, i = 0;
        float N1,N2,N3,media;
        N = teclado.nextInt();
        do{
            N1 = teclado.nextFloat();
            N2 = teclado.nextFloat();
            N3 = teclado.nextFloat();
            media = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / 10.0f;
            System.out.printf("%.1f\n", media);
            i++;
        } while(i < N);
        teclado.close();
    }
    
}
