import java.util.Scanner;

public class URI2161 {
	public static void main(String args[]) {
		final Scanner teclado = new Scanner(System.in);
		double res = 3d;
		double soma = 0;
		int N = teclado.nextInt();

		for (int i = 0; i < N; i++) {
			soma += 6.0;
			soma = (1/soma);
		}

		res += soma;
		System.out.printf("%.10f%n",res);
		teclado.close();
	}
}
