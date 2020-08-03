import java.util.Scanner;

public class URI1038{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int codigo, quantidade;
        float total = 0.00f;
        codigo = input.nextInt();
        quantidade = input.nextInt();
        switch (codigo) {
            case 1:
                total = quantidade * 4.00f;
                break;
            case 2:
                total = quantidade * 4.50f;
                break;
            case 3:
                total = quantidade * 5.00f;
                break;
            case 4:
                total = quantidade * 2.00f;
                break;
            case 5:
                total = quantidade * 1.50f;
                break;
        }
        System.out.printf("Total: R$ %.2f\n",total);
    }
}
