import java.util.Scanner;
public class URI1117 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float nota, media;
        int i;
        i = 0;
        media = 0;
        do{
            nota = teclado.nextFloat();
            if (nota >= 0 && nota <= 10) {
                media += nota;
                i++;
            }else{
                System.out.println("nota invalida");
            }
        }while(i < 2);
        media /= 2;
        System.out.printf("media = %.2f\n",media);
    }
}