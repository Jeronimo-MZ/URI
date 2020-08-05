import java.util.Scanner;
public class URI1164 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, valor, soma;
        N = teclado.nextInt();
        for (int i = 0; i<N; i++){
            valor = teclado.nextInt();
            soma = 0;
            for (int j = 1; j < valor; j++){
                if (valor % j == 0){
                    soma += j;
                }
            }
            System.out.print(valor);
            System.out.println((soma == valor) ?" eh perfeito":" nao eh perfeito");
        }

    }
}