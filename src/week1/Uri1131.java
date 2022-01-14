package week1;

import java.io.IOException;
import java.util.Scanner;

public class Uri1131{

        public static void main(String[] args) throws IOException {
                Scanner scann = new Scanner(System.in);
                int option = 1;
                int totalPart = 0;

                int inter;
                int gremio;

                int nechya = 0;
                int winGremio = 0;
                int winInter = 0;

                while (option == 1) {
                        totalPart++;

                        inter = scann.nextInt();
                        gremio = scann.nextInt();

                        if (inter > gremio) winInter++;
                        else if (gremio > inter) winGremio++;
                        else nechya++;

                        System.out.println("Novo grenal (1-sim 2-nao)");
                        option = scann.nextInt();
                        while (option != 1 && option != 2) {
                                System.out.println("Novo grenal (1-sim 2-nao)");
                                option = scann.nextInt();
                        }
                }

                System.out.println(totalPart + " grenais");
                System.out.println("Inter:" + winInter);
                System.out.println("Gremio:" + winGremio);
                System.out.println("Empates:" + nechya);

                if (winInter > winGremio) System.out.println("Inter venceu mais");
                else if (winGremio > winInter) System.out.println("Gremio venceu mais");
                else System.out.println("Nao houve vencedor");
        }

}
