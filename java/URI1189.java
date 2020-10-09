import java.util.Scanner;

public class URI1189 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double M[][] = new double[12][12];
        double soma = 0;
        int quantidade = 0;
        char opcao = teclado.nextLine().charAt(0);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = teclado.nextDouble();
            }
        }

        for (int i = 1; i < M.length-1; i++) {
            if (i <= 5) {
                for (int j = 0; j < i; j++){
                    soma += M[i][j];
                    quantidade ++; 
                }
            } else{
                for (int j = 0; j < M.length -1 - i; j++){
                    soma += M[i][j];
                    quantidade ++;
                }
            }
        }

        switch (opcao) {
            case 'S':
                System.out.printf("%.1f\n", soma);
                break;
            case 'M':
                System.out.printf("%.1f\n", (soma / quantidade));
                break;
        }

        teclado.close();
    }
}