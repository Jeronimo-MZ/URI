import java.util.Scanner;

public class URI2166 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		double x = 0;

		for (int i = 0; i < N; i++){
			x += 2;
			x = (1/x);
		}
		x += 1;
		System.out.printf("%.10f%n", x);
	}
}