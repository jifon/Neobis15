package week2;

import java.io.IOException;
import java.util.Scanner;

public class Uri1165 {
    public static void main(String[] args) throws IOException {
        Scanner scann = new Scanner(System.in);
        int count = scann.nextInt();

        int num, prime;
        for (int i = 0; i < count; i++) {
            prime = 0;
            num = scann.nextInt();

            for (int j = 2; j < num; j++) {
                if (num % j == 0){
                    prime++;
                }
            }
            if (prime == 0) {
                System.out.println(num + " eh primo");
            }
            else {
                System.out.println(num + " nao eh primo");
            }
        }
    }
}
