import java.util.Scanner;

public class URI3055 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int A, B, media;

		A = teclado.nextInt();
		media = teclado.nextInt();
		B = 2*media - A;
		System.out.println(B);
	}
}