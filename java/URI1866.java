import java.util.Scanner;

public class URI1866 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int valor;
		for (int i = 0; i < N; i++) {
			valor = teclado.nextInt();

			System.out.println((valor % 2 == 0) ? 0 : 1);
		}
	}
}