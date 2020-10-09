import java.util.Scanner;
import java.io.IOException;
public class URI1959 {

	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		long a = teclado.nextLong();
		long b = teclado.nextLong();
		System.out.println(a*b);
		teclado.close();
	}
}