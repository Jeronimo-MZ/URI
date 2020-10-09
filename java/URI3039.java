import java.io.IOException;
import java.util.Scanner;

public class URI3039 {

	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int carrinhos = 0, bonecas = 0;

		int N = Integer.parseInt(teclado.nextLine());
		String entrada;

		for (int i = 0; i < N ; i++) {
			entrada = teclado.nextLine();
			if (entrada.split(" ")[1].charAt(0) == 'M') {
				carrinhos++;
			} else {
				bonecas++;
			}
		}

		System.out.println(carrinhos + " carrinhos");
		System.out.println(bonecas + " bonecas");
	}
}