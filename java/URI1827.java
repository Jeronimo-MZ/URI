import java.util.Scanner;
public class URI1827 {
	public static void main(String args[]){
		final Scanner teclado = new Scanner(System.in);
		
		while ( teclado.hasNextInt()){
			int N = teclado.nextInt();
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (i == j){

						if(i == (N/2)){
							System.out.print(4);
						} else if (!testCondition(i,j, N)) {
							System.out.print(1);
						} else {
							System.out.print(2);
						}

					} else if (j == N-i-1){

						if (!testCondition(i,j,N)){
							System.out.print(1);
						}else{
							System.out.print(3);
						}

					} else {

						if (testCondition(i,j, N)){
							System.out.print(0);
						} else {
							System.out.print(1);
						}
					}
				}
				System.out.println();

			}
			System.out.println();
		}
	}	
	private static boolean testCondition(int i,int j, int N){
		return (i < (N/3) || i > (N - N/3 - 1) || j < (N/3) || j > (N - N/3 - 1));
	}
}