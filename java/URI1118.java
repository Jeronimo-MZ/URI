import java.util.Scanner;
public class URI1118 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float nota, media;
        int i, opcao;
        do{
            media = 0;
            i = 0;
            do{
                nota = input.nextFloat();
                if (nota >= 0 && nota <= 10){
                    media += nota;
                    i++;
                } else {
                    System.out.println("nota invalida");
                }
            }while(i < 2);
            media = media / 2;
            System.out.printf("media = %.2f\n",media);
            do{
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = input.nextInt();
            }while(opcao != 1 && opcao != 2);
        } while(opcao == 1);
    }
}