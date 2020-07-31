import java.util.Scanner;

public class URI1046 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int inicio, fim, tempo;
        inicio = input.nextInt();
        fim    = input.nextInt();

        if (inicio > fim) {
            tempo = 24 - inicio + fim;
        } else if (inicio == fim) {
            tempo = 24;
        }else{
            tempo = fim - inicio;
        }
        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
    }
}