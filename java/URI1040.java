// incompleto -> completo
// wrong answer -> accepted
// analise do funcionamento

import java.util.Scanner;
public class URI1040 {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double N1, N2, N3, N4, media,exame;
        N1    = teclado.nextDouble();
        N2    = teclado.nextDouble();
        N3    = teclado.nextDouble();
        N4    = teclado.nextDouble();
        media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10.0;
        
        if (media*10 - Math.floor(media*10) > 0.5001) {
            media = Math.ceil(media*10)/10;
        }

        else {
            media = Math.floor(media*10)/10;
        }


        System.out.printf("Media: %.1f\n",media);
        if (media>=7.0){
            System.out.println("Aluno aprovado.");
        }else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        } else if (media <= 6.9) {
            System.out.println("Aluno em exame.");
            exame = teclado.nextDouble();
            media = (media+exame) / 2.0;
            System.out.printf("Nota do exame: %.1f\n",exame);
            if (media >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f\n",media);
        }
        teclado.close();

    }
}
