import java.util.Scanner;

public class URI1101 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int m, n, temp, soma;
        
        do{
            m = input.nextInt();
            n = input.nextInt();
            if (m > 0 && n > 0){
                if (m > n){
                    temp = m;
                    m = n;
                    n = temp;
                }
                soma = 0;
                for (int i = m; i<=n; i++){
                    System.out.print(i+" ");
                    soma += i;
                }
                System.out.println("Sum="+soma);
            }
        } while( m > 0 && n > 0);
        input.close();
    }
}
