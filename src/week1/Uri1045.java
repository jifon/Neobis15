package week1;

import java.util.Scanner;

public class Uri1045{

    public static void main(String[] args) {

        double A, B, C;
        Scanner scann =new Scanner(System.in);
        A = scann.nextDouble();
        B = scann.nextDouble();
        C = scann.nextDouble();

        double sideA = Math.max(A, Math.max(B, C));
        double sideB = 0;
        double sideC = 0;

        if (sideA == A) {
            sideB =Math.max(B, C);
            sideC =Math.min(B, C);
        }
        if (sideA == B) {
            sideB =Math.max(A, C);
            sideC =Math.min(A, C);
        }
        if (sideA == C) {
            sideB =Math.max(B, A);
            sideC =Math.min(B, A);
        }
        //------------------------------
        if (sideA >= (sideB + sideC)) {
            System.out.print("NAO FORMA TRIANGULO\n");

        }else if (sideA*sideA > ((sideB*sideB)+(sideC*sideC))) {
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (sideA*sideA == ((sideB*sideB)+(sideC*sideC))) {
            System.out.print("TRIANGULO RETANGULO\n");
        }

        if (sideA*sideA < ((sideB*sideB)+(sideC*sideC))) {
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((sideA == sideB) &&(sideA == sideC)) {
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((sideA == sideB) &&(sideA != sideC)) || ((sideA == sideC) &&(sideA != sideB)) || ((sideB == sideC) &&(sideB != sideA)) ) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }
    }

}