import java.util.Scanner;

public class URI1828 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int T;
        String jogadas, R;
        T = Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= T; i++) {
            jogadas = teclado.nextLine();
            R = jogar(jogadas);
            System.out.println("Caso #" + i + ": " + R);
        }
        teclado.close();
    }

    static String jogar(String jogadas) {
        String sheldon, raj;
        if (jogadas.split(" ").length < 2) {
            return "";
        }
        sheldon = jogadas.split(" ")[0];
        raj = jogadas.split(" ")[1];

        if (sheldon.contentEquals(raj)) {
            return "De novo!";
        } else if (sheldon.contentEquals("tesoura") && (raj.contentEquals("papel") || raj.contentEquals("lagarto"))) {
            return "Bazinga!";
        } else if (sheldon.contentEquals("papel") && (raj.contentEquals("pedra") || raj.contentEquals("Spock"))) {
            return "Bazinga!";
        } else if (sheldon.contentEquals("pedra") && (raj.contentEquals("tesoura") || raj.contentEquals("lagarto"))) {
            return "Bazinga!";
        } else if (sheldon.contentEquals("Spock") && (raj.contentEquals("tesoura") || raj.contentEquals("pedra"))) {
            return "Bazinga!";
        } else if (sheldon.contentEquals("lagarto") && (raj.contentEquals("papel") || raj.contentEquals("Spock"))) {
            return "Bazinga!";
        } else {
            return "Raj trapaceou!";
        }
    }
}
