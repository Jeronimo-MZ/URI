import java.util.Scanner;
public class URI1061 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int diaInicio, horaInicio, minutoInicio, segundoInicio;
        int diaFim, horaFim, minutoFim, segundoFim;
        int dias, horas, minutos, segundos;
        String entradaDia,entradaHoras, temp;

        // leitura e organização dos dados do primeiro dia (Inicio)
        // dia Inicio
        entradaDia = teclado.nextLine(); 
        if (entradaDia.length() == 5){
            temp = String.valueOf(entradaDia.charAt(4));
        }else{
            temp = String.valueOf(entradaDia.charAt(4)) + entradaDia.charAt(5);
        }
        diaInicio = Integer.parseInt(temp);

        // Horario Inicio
        entradaHoras = teclado.nextLine(); 
        temp = String.valueOf(entradaHoras.charAt(0)) + entradaHoras.charAt(1);
        horaInicio = Integer.parseInt(temp);

        temp = String.valueOf(entradaHoras.charAt(5)) + entradaHoras.charAt(6);
        minutoInicio = Integer.parseInt(temp);

        temp = String.valueOf(entradaHoras.charAt(10)) + entradaHoras.charAt(11);
        segundoInicio = Integer.parseInt(temp);

        // Leitura e organização dos dados do ultimo dia (Fim)
        // Dia Inicio
        entradaDia = teclado.nextLine();
        if (entradaDia.length() == 5){
            temp = String.valueOf(entradaDia.charAt(4));
        }else{
            temp = String.valueOf(entradaDia.charAt(4)) + entradaDia.charAt(5);
        }
        diaFim = Integer.parseInt(temp);

        // Horario Fim
        entradaHoras = teclado.nextLine();
        temp = String.valueOf(entradaHoras.charAt(0)) + entradaHoras.charAt(1);
        horaFim = Integer.parseInt(temp);

        temp = String.valueOf(entradaHoras.charAt(5)) + entradaHoras.charAt(6);
        minutoFim = Integer.parseInt(temp);

        temp = String.valueOf(entradaHoras.charAt(10)) + entradaHoras.charAt(11);
        segundoFim = Integer.parseInt(temp);

        // processamento dos dados
        dias = diaFim - diaInicio;

        horas = horaFim - horaInicio;
        minutos = minutoFim - minutoInicio;
        segundos = segundoFim - segundoInicio;
        do {
            if (horas<0){
                dias--;
                horas += 24;
            }

            if (minutos<0){
                horas--;
                minutos += 60;
            }

            if (segundos<0){
                minutos--;
                segundos += 60;
            }
        }while(horas < 0 || minutos < 0 || segundos < 0);
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
    
}