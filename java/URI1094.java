import java.util.Scanner;
public class URI1094 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N, coelhos, ratos, sapos, quantidade, total;
        char tipo;
        coelhos = 0;
        ratos = 0;
        sapos = 0;
        total = 0;
        N = input.nextInt();
        

        for (int i = 0; i < N; i++){
            quantidade = input.nextInt();
            tipo = input.nextLine().charAt(1);
            switch (tipo){
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'R':
                    ratos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }
            total += quantidade;
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f", (coelhos * 100.0f / total));
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", (ratos * 100.0f / total));
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", (sapos * 100.0f / total));
        System.out.println(" %");
        input.close();
    }
}
