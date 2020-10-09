import java.util.Scanner;
public class URI1957 {
	public static void main(String args[]){
		final Scanner teclado =  new Scanner(System.in);
		int V = teclado.nextInt();
		int resto;
		String res = "";
		while (V > 0) {
			resto = V % 16;
			switch (resto) {
				case 10: res = "A" + res; break;
				case 11: res = "B" + res; break;
				case 12: res = "C" + res; break;
				case 13: res = "D" + res; break;
				case 14: res = "E" + res; break;
				case 15: res = "F" + res; break;
				default: res = String.valueOf(resto) + res;
			}
			V = V/16;
		}
		System.out.println(res);
	}
}