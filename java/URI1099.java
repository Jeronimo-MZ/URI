import java.util.Scanner;
public class URI1099 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N ,x, y, temp,soma;
        N = teclado.nextInt();
        for (int i = 0; i < N; i++){
            x = teclado.nextInt();
            y = teclado.nextInt();
            soma = 0;
            if (x > y){
                temp = x;
                x = y;
                y = temp;
            }
            for (int j = x + 1; j < y; j++){
                if (j % 2 != 0){
                    soma += j;
                }
            }
            System.out.println(soma);
            teclado.close();
        }
    }
}
