import java.io.IOException;
import java.util.Scanner;

public class URI3040 {
	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int h, d, g;
		for (int i = 0; i < N; i++) {
			h = teclado.nextInt();
			d = teclado.nextInt();
			g = teclado.nextInt();

			if ((h >= 200 && h <= 300) && (d >= 50) && (g >=150)) {
				System.out.println("Sim");
				
			} else {
				System.out.println("Nao"); 
			} 
		}

	}
}