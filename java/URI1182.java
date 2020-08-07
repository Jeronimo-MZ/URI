import java.util.Scanner;
public class URI1182 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int C = Integer.parseInt(teclado.nextLine());
        char T = teclado.nextLine().charAt(0);
        float arr[][] = new float[12][12];
        float soma = 0;

        for (int i = 0; i < 12; i++){
            for (int j = 0; j <12; j++){
                arr[i][j] = teclado.nextFloat();
            }
        }
        for (int i = 0; i <12; i++){
            soma += arr[i][C];
        }
        switch (T){
            case 'S':
                System.out.printf("%.1f\n",soma);
                break;
            case 'M':
                System.out.printf("%.1f\n", (soma/12));
                break;
        }
        

        teclado.close();
    }
}