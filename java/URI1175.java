import java.util.Scanner;
public class URI1175 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int temp = 0;
        int j = 19;
        int N[] = new int[20];
        for (int i = 0; i<20; i++){
            N[i] = teclado.nextInt();
        }
        for (int i = 0; i<10; i++){
            temp = N[j];
            N[j] = N[i];
            N[i] = temp;
            j--;
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i,N[i]);
        }
        teclado.close();
    }   
}
