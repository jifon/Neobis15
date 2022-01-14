package week1;

import java.io.IOException;
import java.util.Scanner;

public class Uri1145{

        public static void main(String[] args) throws IOException {
                Scanner scann = new Scanner(System.in);
                int X = scann.nextInt();
                int Y = scann.nextInt();
                for (int i = 1; i <= Y; i++) {
                        System.out.print(i);
                        if (i % X == 0){ System.out.println("");}
                        else{ System.out.print(" ");}

                }
        }
}
