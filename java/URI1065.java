import java.util.Scanner;
public class URI1065 {
    
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num, pares;
        pares = 0;

        for (int i = 0; i <5; i++) {
            num = teclado.nextInt();
            if (num %2 ==0) {
                pares++;
            }
        }
        System.out.println(pares + " valores pares");
        teclado.close();
    }
}
