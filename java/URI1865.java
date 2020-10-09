import java.util.Scanner;
public class URI1865 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int N = Integer.parseInt(teclado.nextLine());
		String nome, entrada;
		int forca;
		for (;N>0;N--) {
			entrada = teclado.nextLine();
			nome = entrada.split(" ")[0];
			forca = Integer.parseInt(entrada.split(" ")[1]);

			System.out.println(((nome.equalsIgnoreCase("Thor") ? "Y" : "N")));
		}

		teclado.close();
	}
}