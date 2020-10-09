import java.io.IOException;
import java.util.Scanner;

public class URI3048 {
	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int quantidade = 1, numero;
		int anterior = teclado.nextInt();

		for (int i = 1; i < N; i++)	{
			numero = teclado.nextInt();
			quantidade += (numero != anterior) ? 1: 0;
			anterior = numero;
		}
		System.out.println(quantidade);
	}
}