import java.util.Scanner;
public class URI1759 {
    public static void main(String args[]) {
        final Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        String saida = "Ho ".repeat(N-1) + "Ho!";
        System.out.println(saida);
        teclado.close();
    }
}
