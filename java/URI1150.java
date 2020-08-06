import java.util.Scanner;
public class URI1150 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X, Z, i,soma;
        i = 1;
        X = teclado.nextInt();
        soma = X;
        do{
            Z = teclado.nextInt();
        }while(X>=Z);
        do{
            soma += ++X;
            i++;
        }while(soma <= Z);
        System.out.println(i);
        teclado.close();
    }
}
