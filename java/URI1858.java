import java.util.Scanner;
public class URI1858 {
	public static void main(String args[]){
		final Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int valor = teclado.nextInt();
		int menor = valor;
		int posMenor = 1;
		for (int i = 2; i <= N; i++){
			valor = teclado.nextInt();
			if (valor < menor){
				menor = valor;
				posMenor = i;
			}
		}
		System.out.println(posMenor);

		teclado.close();
	}
}