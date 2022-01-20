package week1;

import java.io.IOException;
import java.util.Scanner;

public class Uri1018{

    public static void main(String[] args) throws IOException {
        Scanner scann = new Scanner(System.in);
        int money = scann.nextInt();
        int banknot = money;
        int notas100 = banknot / 100;
        banknot -= notas100 * 100;
        int notas50 = banknot / 50;
        banknot -= notas50 * 50;
        int notas20 = banknot / 20;
        banknot -= notas20 * 20;
        int notas10 = banknot / 10;
        banknot -= notas10 * 10;
        int notas5 = banknot / 5;
        banknot -= notas5 * 5;
        int notas2 = banknot / 2;
        banknot -= notas2 * 2;
        int notas1 = banknot;

        System.out.println(money);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }

}