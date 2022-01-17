package week2;

import java.util.Locale;
import java.util.Scanner;
public class Uri1253 {
    public static void main(String[] args){

        Scanner scann = new Scanner(System.in);
        scann.useLocale(Locale.ENGLISH);

        int N = scann.nextInt();
        for (int i=0 ; i<N ; i++){
            scann.nextLine();
            String code = scann.nextLine();
            int keyForCode = scann.nextInt();
            char[] chars = code.toCharArray();

            for (int x=0 ; x<chars.length ; x++){
                if((chars[x]-keyForCode) < 65)
                    chars[x]+=(26-keyForCode);
                else
                    chars[x]-=keyForCode;
            }
            System.out.println(chars);
        }
        scann.close();


    }
}
