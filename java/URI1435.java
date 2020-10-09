import java.util.Scanner;
public class URI1435 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N, numero, valor;
        String sp, sp2;
        numero = 0;
        do{
            N = teclado.nextInt();
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    valor = 0;
                    do {
                        if (i == valor || i == N-valor-1 ||
                            j == valor || j == N-valor-1) {
                            numero = valor+1;
                            break;
                        }
                        valor++;
                    } while(valor < N);
                    sp = (j < N-1) ? " " : "";

                    if(numero < 10){
                        sp2 = "  ";
                    } else{
                        sp2 = " ";
                    }
                    sp2 = (j==0) ? "  " : sp2;
                    System.out.print(sp2 + numero+ sp);
                }
                System.out.println();
            }
            if (N != 0){
                System.out.println();
            }
        }while(N != 0);

        teclado.close();
    }
}