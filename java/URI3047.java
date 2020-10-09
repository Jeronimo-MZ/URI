import java.io.IOException;
import java.util.Scanner;

public class URI3047 {
	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);

		int M, A, B, C;

		M = teclado.nextInt();
		A = teclado.nextInt();
		B = teclado.nextInt();

		C = M - A - B;

		int maior = A;

		maior = (B > maior) ? B : maior;
		maior = (C > maior) ? C : maior;
		System.out.println(maior);

	}
}