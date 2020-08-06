import java.util.Scanner;
public class URI1146 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int X;

        do{
            X = teclado.nextInt();
            if (X != 0) {
                for (int i = 1; i <= X; i++){
                    if (i == 1){
                        System.out.print(i);
                    }else{
                        System.out.print(" "+i);
                    }
                }
                System.out.println();
            }
        }while(X != 0);
        teclado.close();
    }
}
