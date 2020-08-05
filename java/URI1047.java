import java.util.Scanner;
public class URI1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int horaInicio, horaFim, minutoInicio, minutoFim;
        int horas, minutos;
        horaInicio = teclado.nextInt();
        minutoInicio = teclado.nextInt();
        horaFim = teclado.nextInt();
        minutoFim = teclado.nextInt();

        if (horaInicio > horaFim){
            horas = 24-horaInicio+horaFim;
        }else if(horaInicio == horaFim){
            if (minutoInicio >= minutoFim) {
                horas = 24;
            } else {
                horas = 0;
            }
        }else {
            horas = horaFim-horaInicio;
        }
        if (minutoFim > minutoInicio){
            minutos = minutoFim - minutoInicio;
        } else if (minutoInicio == minutoFim){
            minutos = 0;
        }else{
            horas--;
            minutos = 60 - minutoInicio + minutoFim;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}