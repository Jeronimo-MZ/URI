import java.util.Scanner;

public class URI2176 {
	public static void main(String args[]) {
		final Scanner teclado = new Scanner(System.in);
		String s = teclado.nextLine();
		int qtd1 = 0;

		for (int i = 0; i < s.length(); i++) if(s.charAt(i)=='1') qtd1++;

		s += (qtd1 % 2 == 0) ? "0": "1";
		System.out.println(s);

		teclado.close();
	}
}