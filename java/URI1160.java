import java.util.Scanner;
public class URI1160 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int T, PA, PB, anos;
        float actualA, actualB; 
        float G1,G2; // percentual
        T = teclado.nextInt();
        for (int i = 0; i < T; i++){
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextFloat()/100;
            G2 = teclado.nextFloat()/100;
            actualA = PA;
            actualB = PB;
            anos = 0;

            while(actualA <= actualB && anos <= 100){
                actualA += Math.floor(actualA*G1);
                actualB += Math.floor(actualB*G2);
                anos++;
            }
            if (anos <= 100){
                System.out.println(anos + " anos.");
            } else {
                System.out.println("Mais de 1 seculo.");
            }
        }
        teclado.close();
    }
}
