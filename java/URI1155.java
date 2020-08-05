public class URI1155 {
    public static void main(String args[]) {
        float S = 0;
        for (int i = 1; i <= 100; i++){
            S += 1.0/i;
        }
        System.out.printf("%.2f\n",S);
    }
}