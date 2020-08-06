import java.util.Scanner;
public class URI1154 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float idade = 0, soma,media;
        soma = 0;
        int i = -1;
        while(idade >=0){
            soma += idade;
            idade = teclado.nextInt();
            i++;
        }
        media = soma /i;
        System.out.printf("%.2f\n",media);
        teclado.close();
    }
}
