import java.util.Scanner;
public class URI1042 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N1,N2,N3, temp;
        int arr[];
        arr    = new int[3];
        N1     = teclado.nextInt(); 
        N2     = teclado.nextInt();
        N3     = teclado.nextInt();
        arr[0] = N1;
        arr[1] = N2;
        arr[2] = N3;

        for (int i=0; i<arr.length; i++){
            for (int j=1; j < arr.length; j++){
                if (arr[j] < arr[j-1]){
                    temp     = arr[j];
                    arr[j]   = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2] + "\n");
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
    }
}