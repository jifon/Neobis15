package week1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1021{

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double money = scann.nextDouble();

        if (money >= 0 && money <= 1000000.00) {

            int banknot[] = {100, 50, 20, 10, 5, 2};
            double coins[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

            System.out.println("NOTAS:");
            for (int i = 0; i < banknot.length; i++) {
                int t = (int) (money / banknot[i]);
                System.out.printf("%d nota(s) de R$ %.2f\n",t ,  (double)banknot[i]);
                money = parsToDouble(money - banknot[i]*t);
            }
            System.out.println("MOEDAS:");
            for (int i = 0; i < coins.length; i++) {
                int t = (int) (money / coins[i]);
                System.out.printf("%d moeda(s) de R$ %.2f\n", (int) (money / coins[i]), coins[i]);
                money = parsToDouble(money - coins[i]*t);
            }
        }

    }
    private static double parsToDouble(double x){
        DecimalFormat format = new DecimalFormat("#0.00");
        return Double.valueOf(format.format(x));
    }
}
