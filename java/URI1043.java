import java.util.Scanner;
public class URI1043 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c, perimetro, area;
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if (Math.abs(a - b) < c && c < (a + b)) {
            perimetro = a+b+c;
            System.out.println("Perimetro = " + perimetro);
        }else{
            area = (a+b)*c/2;
            System.out.printf("Area = %.1f\n", area);
        }
        teclado.close();
    }
}
