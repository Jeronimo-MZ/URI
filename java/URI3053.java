import java.util.Scanner;

public class URI3053 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int numeroMovimentos = Integer.parseInt(teclado.nextLine());
		char moeda = teclado.nextLine().toUpperCase().charAt(0);
		int movimento;

		for (int i = 0; i < numeroMovimentos; i++){
			movimento = teclado.nextInt();
			switch (movimento){
				case 1:
					if (moeda == 'A') moeda = 'B';
					else if (moeda == 'B') moeda = 'A';
					break;
				case 2:
					if (moeda == 'B') moeda = 'C';
					else if (moeda == 'C') moeda = 'B';
					break;
				case 3:
					if (moeda == 'C') moeda = 'A';
					else if (moeda == 'A') moeda = 'C';
					break;
			}
		}
		System.out.println(moeda);
	}
}