import java.util.Scanner;
import java.io.IOException;

public class URI3046 {
	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();

		int sol = ((N+1) * (N+2)) /2;

		System.out.println(sol);

	}
}