import java.util.Scanner;
public class URI1534 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, valor;
        do{
            N = teclado.nextInt();
            for (int i =0; i<N; i++){
                for (int j =0; j<N; j++){
                    if (i == j){
                        if (N % 2 !=0 && i== N/2){
                            valor = 2;
                        }else{
                            valor = 1;
                        } 
                            
                    } else if (i == (N-j-1)) {
                        valor = 2;
                    }else valor = 3;
                    System.out.print(valor);
                }
                System.out.println();
            }
        } while(teclado.hasNext());

        teclado.close();
    }    
}
