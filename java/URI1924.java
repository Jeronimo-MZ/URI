import java.util.Scanner;

public class URI1924 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int N = Integer.parseInt(teclado.nextLine());
		String curso;
		for (int i = 0; i < N; i++){
			curso = teclado.nextLine();
		}
		curso = "Ciencia da Computacao";
		System.out.println(curso);

		teclado.close();
	}
}