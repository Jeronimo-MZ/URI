import java.util.Scanner;  
public class URI1789 {

    public static void main(String args[]) {
        final Scanner teclado =  new Scanner(System.in);
        int N, velocidade, maior;
        do {
            N = teclado.nextInt();
            maior = 0;
            for (int i=0; i<N; i++) {
                velocidade = teclado.nextInt();
                maior = (velocidade > maior) ? velocidade : maior;
            }
            if (maior<10) System.out.println("1");
            else if (maior<20) System.out.println("2");
            else System.out.println("3");
        }while(teclado.hasNextInt()); //EOF
        teclado.close();
    }
    
}
