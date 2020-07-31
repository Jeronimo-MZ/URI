// Múltiplos
import java.util.Scanner;

public class URI1044 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a, b, temp, multiplo, i;
        boolean condicao;
        a        = input.nextInt();
        b        = input.nextInt();
        condicao = false;
        i        = 1;
        if (a>b){
            temp = a;
            a    = b;
            b    = temp;
        }
        do{
            multiplo = a*i;
            if (multiplo == b){
                condicao = true;
                break;
            }
            i++;
        }while(multiplo <= b);
        if (condicao) {
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}