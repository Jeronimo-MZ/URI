import java.util.Scanner;
public class URI1847 {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        int A,B,C; // dia 1, dia 2, dia 3
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        if (B < A){ // desceu do dia 1 para o dia 2
            if (C >= B || (B-C < A-B)) System.out.println(":)");
            else System.out.println(":(");
        }else if (B > A){
            if (C <= B || (C-B < B-A)) System.out.println(":(");
            else System.out.println(":)");
        }else{
            if (C>B) System.out.println(":)");
            else System.out.println(":(");
        }
        teclado.close();
    }
}
