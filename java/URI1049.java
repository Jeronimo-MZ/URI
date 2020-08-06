import java.util.Scanner;
public class URI1049 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str1,str2,str3;

        str1 = input.nextLine();
        str2 = input.nextLine();
        str3 = input.nextLine();

        if (str1.charAt(0) == 'v'){ // vertebrado
            if (str2.charAt(0) == 'a' && str3.charAt(0) == 'c'){ // ave ; carnivoro
                System.out.println("aguia");
            }
            if (str2.charAt(0) == 'a' && str3.charAt(0) == 'o'){ // ave; onivoro
                System.out.println("pomba");
            }
            if (str2.charAt(0) == 'm' && str3.charAt(0) == 'o'){ //mamifero; onivoro
                System.out.println("homem");
            }
            if (str2.charAt(0) == 'm' && str3.charAt(0) == 'h'){ // mamifero; herbivoro
                System.out.println("vaca");
            }
        }else if (str1.charAt(0) == 'i'){ // invertebrado
            if (str2.charAt(0) == 'i' && str3.charAt(2) == 'm'){ //inseto; hematofago
                System.out.println("pulga");
            }
            if (str2.charAt(0) == 'i' && str3.charAt(2) == 'r'){ // inseto herbivoro
                System.out.println("lagarta");
            }
            if (str2.charAt(0) == 'a' && str3.charAt(0) == 'h'){ // anelideo hematofago
                System.out.println("sanguessuga");
            }
            if (str2.charAt(0) == 'a' && str3.charAt(0) == 'o'){ // anelideo onivoro
                System.out.println("minhoca");
            }
        }
        input.close();
    }
}
