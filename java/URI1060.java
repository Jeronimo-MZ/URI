import java.util.Scanner;
public class URI1060 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        double num;
        int positivos = 0;
        for (int i = 0; i <6; i++){
            num = input.nextDouble();
            if (num > 0){
                positivos += 1;
            }
        }
        System.out.println(positivos + " valores positivos");
    }
}