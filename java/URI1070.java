import java.util.Scanner;
public class URI1070 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int n,cont;
        cont = 1;
        n = input.nextInt();
        if (n %2 == 0){
            n++;
        }
        do{
            System.out.println(n);
            n += 2;
            cont++;
        }while(cont<=6);
        
    }
}