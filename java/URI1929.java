import java.util.Scanner;
public class URI1929 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if (Math.abs(A-B) < C && C < A+B ||
            Math.abs(A-B) < D && D < A+B ||
            Math.abs(A-C) < D && D < A+C ||
            Math.abs(B-C) < D && D < B+C){
                System.out.println("S");
            }else {
                System.out.println("N");
            }
        teclado.close();
    }
}
