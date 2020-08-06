public class URI1098 {
    public static void main(String args[]){
        float i = 0;
        float j = 1;
        do{
            if (i == 0.0 ||i == 1.0 || i >= 2.0){
                System.out.printf("I=%.0f J=%.0f\n",i,j);
                System.out.printf("I=%.0f J=%.0f\n",i,(j+1));
                System.out.printf("I=%.0f J=%.0f\n",i,(j+2));
            } else{
                System.out.printf("I=%.1f J=%.1f\n",i,j);
                System.out.printf("I=%.1f J=%.1f\n",i,(j+1));
                System.out.printf("I=%.1f J=%.1f\n",i,(j+2));
            }
            i += 0.2f;
            j += 0.2f;
        }while(i < 2.2);
    }
}
