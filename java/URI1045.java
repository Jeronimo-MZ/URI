// Tipos de triangulos
import java.util.Scanner;

public class URI1045 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float a,b,c,maior,menor,medio;
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        if (a >= b && a >= c) {
            maior = a;
        }else if (b >= a && b >= c) {
            maior = b;
        } else {
            maior = c;
        }

        if (a <= b && a <= c){
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
        }
        medio = (a + b + c) - (maior + menor);
        a = maior;
        b = medio;
        c = menor;
        //System.out.println(a + " -> " + b + " -> " + c);

        if (a >= (b+c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else{
            if ((a*a) == (b*b + c*c)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a*a) > (b*b + c*c)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a*a) < (b*b + c*c)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a==b && a==c){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ( (a==b && a!= c) || (a==c && a != b) || (b==c && b != a)){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        input.close();
    }
}
