import java.util.Scanner;
public class URI1145 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X,Y, cont;
        X = teclado.nextInt();
        Y = teclado.nextInt();
        cont = 0;
        for (int i= 1; i <= Y; i++) {
            System.out.print(i);
            cont++;      
            if (cont % X ==0 || cont == Y){
                System.out.println("");
            } else{
                System.out.print(" ");
            }
        }

    }
}