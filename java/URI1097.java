public class URI1097 {
    public static void main(String args[]) {
        int j = 7;
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("I=" + i + " J=" + j);
            System.out.println("I=" + i + " J=" + (j-1));
            System.out.println("I=" + i + " J=" + (j-2));
            j += 2;
        }
    }
}