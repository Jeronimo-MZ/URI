import java.util.Scanner;
public class URI1183 {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float soma = 0;
        float M[][] = new float[12][12];
        char operacao = teclado.nextLine().charAt(0);
        int quantidade = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = teclado.nextFloat();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = i+1; j < 12; j++) {
                soma += M[i][j];
                quantidade++;
            }
        }
        switch (operacao){
            case 'S':
                System.out.printf("%.1f\n",soma);
                break;
            case 'M':
                System.out.printf("%.1f\n",(soma/quantidade));
                break;
        }
        teclado.close();
    }
}