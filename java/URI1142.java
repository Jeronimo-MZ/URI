import java.util.Scanner;
public class URI1142 {
    
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int N = teclado.nextInt();
        int num = 1;
        do{
            System.out.printf("%d %d %d PUM\n", num, (++num), (++num));
            num += 2;
            i++;
        }while (i < N);
        teclado.close();
    }
}
