import java.util.Scanner;
public class URI1158 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int X, Y, soma,contador;
        for (int i =0; i < N; i++){
            X = teclado.nextInt();
            Y = teclado.nextInt();
            soma = 0;
            contador = 0;
            if (X % 2 == 0){
                X++;
            }
            do{
                soma += X;
                X += 2;
                contador++;
            } while(contador < Y);
            System.out.println(soma);
        }
    }
}