// Aumento de salário
import java.util.Scanner;
public class URI1048 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int percentual;
        float novoSalario, salario;
        salario = teclado.nextFloat();

        if (salario > 0 && salario <= 400.00){
            percentual = 15;
        }else if (salario <= 800.00) {
            percentual = 12;
        }else if (salario <= 1200.00) {
            percentual = 10;
        }else if (salario <= 2000.00) {
            percentual = 7;
        }else {
            percentual = 4;
        }
        novoSalario = salario + (salario * percentual / 100);
        System.out.printf("Novo salario: %.2f\n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n",(novoSalario - salario));
        System.out.println("Em percentual: " + percentual + " %");
        teclado.close();
    }
}
