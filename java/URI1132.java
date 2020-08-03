import java.util.Scanner;
public class URI1132 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X,Y, temp,soma = 0;
        X = teclado.nextInt();
        Y = teclado.nextInt();
        if (X > Y){
            temp = X;
            X = Y;
            Y = temp;
        }
        for  (int i = X; i <= Y; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}