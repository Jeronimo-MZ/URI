import java.util.Scanner;
public class URI1159 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X,soma;
        do{
            X = teclado.nextInt();
            if (X != 0){
                soma = 0;
                if (X%2 != 0){
                    X++;
                }
                for (int i = 0; i < 5; i++){
                    soma += X;
                    X += 2;
                }
                System.out.println(soma);
            }
        }while(X !=0);
    }
}