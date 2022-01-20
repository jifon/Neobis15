package week2;

import java.util.Locale;
import java.util.Scanner;

public class Uri1238 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        scann.useLocale(Locale.ENGLISH);

        int N = Integer.parseInt(scann.nextLine());

        for (int i=0 ; i<N ; i++) {
            String[] str = scann.nextLine().split(" ");
            char[] fr1 = str[0].toCharArray();
            char[] fr2 = str[1].toCharArray();
            String ans = "";

            for (int z=0 ; z<(fr1.length+fr2.length) ; z++) {
                if (z<fr1.length)
                    ans+=fr1[z];
                if (z<fr2.length)
                    ans+=fr2[z];
            }
            System.out.println(ans);
        }
        scann.close();
    }
}