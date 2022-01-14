package week1;

<<<<<<< HEAD
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1160{
    public static void main(String[] args) throws ParseException {

=======
import java.util.Scanner;

public class Uri1160{
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int century;
        double g1, g2;
        int pa, pb;
        int t = scann.nextInt();


        for (int i = 0; i < t; i++) {
            century = 101;

            pa = scann.nextInt();
            pb = scann.nextInt();
            g1 = scann.nextDouble();
            g2 = scann.nextDouble();

            for (int j = 0; j < 100; j++) {
                pa = (int) ((1 + (g1 / 100)) * pa);
                pb = (int) ((1 + (g2 / 100)) * pb);
                if (pa > pb) {
                    century = (j + 1);
                    break;
                }
            }
            if (century > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(century + " anos.");
            }
        }
>>>>>>> 1f598ec ("Last solution")
    }
}


<<<<<<< HEAD
=======


>>>>>>> 1f598ec ("Last solution")
