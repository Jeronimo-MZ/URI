import java.util.Scanner;

public class URI2344 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();

		if (N <= 0) System.out.println("E");
		else if (N <= 35) System.out.println("D");
		else if (N <= 60) System.out.println("C");
		else if (N <= 85) System.out.println("B");
		else if (N <= 100) System.out.println("A");
	}
}