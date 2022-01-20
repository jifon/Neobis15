package week2;

import java.util.Locale;
import java.util.Scanner;

public class Uri2253 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        scann.useLocale(Locale.ENGLISH);
        int upperCase=0, leastCase=0, number=0;

        while(scann.hasNext()){

            String s = scann.nextLine();

            if (s.length() >= 6 && s.length() <= 32){
                for(int i=0 ; i<s.length() ; i++){
                    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                        leastCase++;
                    else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        upperCase++;
                    else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        number++;
                }
                if (upperCase==0)
                    System.out.println("Senha invalida.");
                else if (leastCase==0)
                    System.out.println("Senha invalida.");
                else if (number==0)
                    System.out.println("Senha invalida.");
                else if (upperCase+leastCase+number==s.length())
                    System.out.println("Senha valida.");
                else
                    System.out.println("Senha invalida.");
            }
            else
                System.out.println("Senha invalida.");

            leastCase=0;
            upperCase=0;
            number=0;
        }
        scann.close();
    }
}