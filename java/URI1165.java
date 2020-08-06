import java.util.Scanner;
public class URI1165 {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, X, divisores;
        N = teclado.nextInt();
        for (int i = 0; i < N; i++){
            X = teclado.nextInt();
            divisores = 0;
            for (int j = 1; j <= X; j++){
                divisores += (X % j == 0) ? 1 :0; 
            }
            System.out.println(X + ((divisores ==2 )?" eh primo" : " nao eh primo"));
        }
        teclado.close();
    }
}
