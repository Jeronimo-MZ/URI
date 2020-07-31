// incompleto
// wrong answer
// UDEBUG

import java.util.Scanner;
public class URI1040 {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float N1, N2, N3, N4, media,exame;
        int mediaAproximada;
        N1    = teclado.nextFloat();
        N2    = teclado.nextFloat();
        N3    = teclado.nextFloat();
        N4    = teclado.nextFloat();
        media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
        System.out.printf("Media: %1f\n",media);
        if (media>=7){
            System.out.println("Aluno aprovado.");
        }else if (media < 5){
            System.out.println("Aluno reprovado.");
        } else{
            System.out.println("Aluno em exame.");
            exame = teclado.nextFloat();
            media = (media+exame) / 2;
            System.out.printf("Nota do exame: %1f\n",exame);
            if (media >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            mediaAproximada = Math.round(media);
            System.out.printf("Media final: %d.0\n",mediaAproximada);
        }

    }
}