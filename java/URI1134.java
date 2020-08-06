import java.util.Scanner;
public class URI1134 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N; 
        int alcool = 0; 
        int gasolina = 0; 
        int diesel = 0;
        do{
            N = teclado.nextInt();
            switch (N){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }

        }while( N != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        teclado.close();
    }
}
