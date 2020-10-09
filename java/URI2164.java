import java.util.Scanner;

public class URI2164 {
	public static void main(String args[]) {
			final Scanner teclado = new Scanner(System.in);

			int n = teclado.nextInt();
			double fib = (Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n))/Math.sqrt(5);
			System.out.printf("%.1f%n",fib);
	}
}