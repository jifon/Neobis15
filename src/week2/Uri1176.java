package week2;

import java.util.Scanner;
public class Uri1176 {
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);

        int count, num;
        long fibonacci[] = new long[61];
        count = scann.nextInt();

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int j = 2; j <= 60; j++){
            fibonacci[j] = fibonacci[j-2] + fibonacci[j-1];
        }

        for(int i = 0; i < count; i++){
            num = scann.nextInt();
            System.out.printf("Fib(%d) = %d\n", num, fibonacci[num]);
        }
    }

}
