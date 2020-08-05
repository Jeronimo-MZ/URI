import java.util.Scanner;
public class URI1180 {

    public static void main(String[] args) {
        int[] vector;
        int menor, pos;
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        vector = new int[N];
        for (int i = 0; i < N; i++){
            vector[i] = teclado.nextInt();
        }
        menor = vector[0];
        pos = 0;
        for (int i = 1; i < vector.length; i++){
            if (vector[i] < menor) {
                menor = vector[i];
                pos = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pos);

    }
    
}