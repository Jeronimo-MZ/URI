import java.util.Scanner;
public class URI1080 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N, pos,maior;
        N = teclado.nextInt();
        maior = N;
        pos = 0;
        for (int i=1; i<100; i++){
            N = teclado.nextInt();
            if (N > maior){
                maior = N;
                pos = i;
            }
        }
        System.out.println(maior+"\n" + (pos + 1));
    }
}