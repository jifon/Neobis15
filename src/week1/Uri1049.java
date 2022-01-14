package week1;

import java.util.Scanner;

public class Uri1049{

    public static void main(String[] args) {
        Scanner scann =new Scanner(System.in);

        int n;
        float number1, number2, number3;
        float avg;
        n = scann.nextInt();

        for (int i = 1; i <= n; i++) {
            number1 = scann.nextFloat();
            number2 = scann.nextFloat();
            number3 = scann.nextFloat();
            avg = ( number1*2 + number2*3 + number3*5 ) / 10;
            System.out.printf("%.1f\n", avg);
        }
    }

}
