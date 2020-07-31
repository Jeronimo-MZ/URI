import java.util.Scanner;
public class URI1020 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N,anos,meses, dias,resto;
        N     = input.nextInt();
        anos  = N / 365;
        resto = N % 365;
        meses = resto / 30;
        resto = resto % 30;
        dias  = resto;

        System.out.printf("%d ano(s)\n",anos);
        System.out.printf("%d mes(es)\n",meses);
        System.out.printf("%d dia(s)\n",dias);

    }
}