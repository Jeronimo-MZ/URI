import java.util.Scanner;
public class URI1115 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int x,y;

        do{
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }else if (x > 0 && y < 0){
                System.out.println("quarto");
            }

        }while ( x != 0 && y != 0);
    }
    
}