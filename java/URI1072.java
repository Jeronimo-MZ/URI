import java.util.Scanner;
public class URI1072 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N, X, in, out;
        in = 0;
        out = 0;
        N = teclado.nextInt();
        for (int i = 0; i < N; i++){
            X = teclado.nextInt();
            if (X >= 10 && X <= 20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in+ " in");
        System.out.println(out+ " out");
        teclado.close();

    }
}
