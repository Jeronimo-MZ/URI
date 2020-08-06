import java.util.Scanner;
public class URI1131 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int golsGremio, golsInter, vitoriasGremio;
        int vitoriasInter, empates, opcao, cont;
        vitoriasGremio = 0;
        vitoriasInter = 0;
        empates = 0;
        cont = 0;
        do{
            cont++;
            golsInter = teclado.nextInt();
            golsGremio = teclado.nextInt();
            if (golsInter > golsGremio){
                vitoriasInter++;
            } else if (golsInter < golsGremio){
                vitoriasGremio++;
            } else {
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = teclado.nextInt();
        }while (opcao != 2);
        System.out.println(cont + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        if (vitoriasGremio > vitoriasInter){
            System.out.println("Gremio venceu mais");
        }else if (vitoriasGremio < vitoriasInter){
            System.out.println("Inter venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
        teclado.close();
    }
}
