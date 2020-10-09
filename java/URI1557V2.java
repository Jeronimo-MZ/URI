import java.util.Scanner;

public class URI1557V2 {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        int N, T=0, exp;
        int [][]vector;


        do{
            N = teclado.nextInt();
            vector = new int[N][N];
            for (int i = 0; i < vector.length; i++){
                exp = i;
                for (int j = 0; j < vector.length; j++){
                    vector[i][j] = (int)Math.pow(2,exp);
                    exp++;
                }
            }
            if (N>0) T = Integer.toString(vector[N-1][N-1]).length();
            for (int i = 0; i < vector.length; i++){
                for (int j = 0; j < vector.length; j++){
                    if (j==0) System.out.printf("%"+ T +"d", vector[i][j]);
                    else System.out.printf("%"+ (T+1) +"d", vector[i][j]);
                }
                System.out.println();
            }
            if (N>0) System.out.println();
        } while (N != 0);
        teclado.close();
    }    
}
