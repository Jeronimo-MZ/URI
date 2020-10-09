import java.util.Scanner;

public class URI1478 {

    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        int N;
        int matrix[][];
        String sp,sp2;
        do {
            N = teclado.nextInt();
            matrix = new int[N][N];
            for (int i = 0; i < N; i++) matrix[i][i] = 1;

            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++){
                    if (j!=i){
                        matrix[i][j] = matrix[i][j-1]+1;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++){
                    if (j!=i){
                        matrix[i][j] = matrix[i-1][j]+1;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sp = (j < N-1) ? " " : "";
                    if(matrix[i][j] < 10){
                        sp2 = "  ";
                    } else{
                        sp2 = " ";
                    }
                    sp2 = (j==0 && matrix[i][j] < 10) ? "  " : sp2;
                    sp2 = (j == 0 && matrix[i][j] >= 100) ? "" : (matrix[i][j] >= 100) ? "" : sp2;

                    System.out.print(sp2 + matrix[i][j] + sp);
                }
                System.out.println();
            }

            if (N > 0) System.out.println();
            
        } while(N > 0);

        teclado.close();
    }
}