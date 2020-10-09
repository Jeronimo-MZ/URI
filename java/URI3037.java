import java.util.Scanner;
import java.io.IOException;

public class URI3037 {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();

		int pontosJoao, pontosMaria;
		int x, d;

		for (int i = 0; i < N; i++) {
			pontosJoao = pontosMaria = 0;
			for (int j = 0; j < 3; j++) {
				x = teclado.nextInt();
				d = teclado.nextInt();
				pontosJoao += x*d;
			}
			for (int j = 0; j < 3; j++) {
				x = teclado.nextInt();
				d = teclado.nextInt();
				pontosMaria += x*d;
			}
			System.out.println((pontosMaria > pontosJoao) ? "Maria" : "Joao");
		}

		teclado.close();
	}
}