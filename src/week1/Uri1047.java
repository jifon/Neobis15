package week1;

import java.util.Scanner;
public class Uri1047{
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        int startH1 = scann.nextInt();
        int startM1 = scann.nextInt();
        int endH2 = scann.nextInt();
        int endM2 = scann.nextInt();
        int first = (startH1*60) + startM1;
        int second = (endH2*60) + endM2;
        int hours24 = (24*60);
        int big = 0;
        if(second>first){
            big = second-first;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(big/60), (big%60));
        }else if(first>second){
            big = (hours24-first)+(second);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(big/60), (big%60));
        }else if(second==first){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }

    }
}

