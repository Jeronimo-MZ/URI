// Imposto de Renda
import java.util.Scanner;
public class URI1051 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float renda, imposto;
        renda = teclado.nextFloat();
        
        if (renda <= 2000.00) {
            imposto = 0;
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000) * 0.08f;
        } else if (renda <= 4500.00) {
            imposto = 1000 * 0.08f + (renda - 3000) * 0.18f;
        } else {
            imposto = 1000 * 0.08f + 1500 * 0.18f + (renda - 4500) * 0.28f;
        }
        if (imposto > 0) {
            System.out.printf("R$ %.2f\n",imposto);
        } else{
            System.out.println("Isento");
        }
    }
    
}