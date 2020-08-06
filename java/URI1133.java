import java.util.Scanner;
public class URI1133 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int x,y,temp;
        x = teclado.nextInt();
        y = teclado.nextInt();
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        for (int i = x; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
        teclado.close();
    }
}
