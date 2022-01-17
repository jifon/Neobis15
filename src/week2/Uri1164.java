package week2;

import java.io.IOException;
import java.util.Scanner;

public class Uri1164 {
    public static void main(String[] args) throws IOException {
        Scanner scann = new Scanner(System.in);
        int count = scann.nextInt();

        int num, sum;
        for (int i = 0; i < count; i++) {
            sum = 0;
            num = scann.nextInt();

            for (int j = 1; j < num; j++) {
                if (num % j == 0){
                    sum += j;
                }
            }
            if (sum == num) {
                System.out.println(num + " eh perfeito");
            }
            else {
                System.out.println(num + " nao eh perfeito");
            }
        }
    }
}
