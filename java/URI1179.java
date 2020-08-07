import java.util.Scanner;
public class URI1179 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int valor;
        int par[] = new int[5];
        int impar[] = new int[5];

        for (int i = 0; i < 15; i++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                par[pares] = valor;
                pares++;
            } else {
                impar[impares] = valor;
                impares++;
            }
            
            if (impares > 4 || i == 14){
                impares = 0;
                for (int j = 0; j < 5; j++){
                    if (impar[j] != 0){
                        System.out.printf("impar[%d] = %d\n", j, impar[j]);
                        impar[j] = 0;
                    }
                }
            }
            if (pares > 4 || i == 14){
                pares = 0;
                for (int j = 0; j < 5; j++){
                    if (par[j] != 0){
                        System.out.printf("par[%d] = %d\n", j, par[j]);
                        par[j] = 0;
                    }
                }
            }
        }

        teclado.close();
    }
}