import java.util.Scanner;
public class URI1149 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int soma, A, N;
        A = teclado.nextInt();
        do{
            N = teclado.nextInt();
        }while(N <= 0);
        soma = 0;
        for (int i = 0; i < N; i++){
            soma += A+i;
        }
        System.out.println(soma);
    }
}