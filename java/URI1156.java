public class URI1156 {
    public static void main(String arg[]){
        float S = 0.0f, j = 1.0f, i = 1.0f;
        do{
            S += i/j;
            j *= 2;
            i += 2;
        }while(i<=39);
        System.out.printf("%.2f\n",S);
    }
}