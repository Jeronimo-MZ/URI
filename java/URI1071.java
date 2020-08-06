import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y, temp, soma;
        x = teclado.nextInt();
        y = teclado.nextInt();
        soma = 0;
        if (x > y) {
            temp = x;
            x = y;
            y =temp;
        }
        for (int i = x+1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        teclado.close();
    }
}

//-5 -4 -3 -2 -1 0 1 2 3 4 5