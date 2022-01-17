package week2;

import java.io.IOException;
import java.util.Scanner;
public class Uri1182 {

    public static void main(String[] args) throws IOException {

        Scanner scann = new Scanner(System.in);
        int C = scann.nextInt();
        double sum = 0;
        char T = scann.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; i++)
        {
            for (int j = 0; j < M[i].length; j++)
            {
                M[i][j] = scann.nextDouble();
            }
        }

        for(int j = 0; j < M.length; j++)
        {
            sum += M[j][C];
        }

        if (T == 'M') sum /= M.length;
        System.out.println(String.format("%.1f", sum));
    }

}
