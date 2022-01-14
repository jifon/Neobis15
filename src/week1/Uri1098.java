package week1;

import java.io.IOException;
import java.text.DecimalFormat;

public class Uri1098{
        public static void main(String[] args) throws IOException {
                double i = 0;
                double j = 1;
                DecimalFormat formatDecimal = new DecimalFormat("0.0");

                while (i <= 2) {
                        for (int k = 0; k < 3; k++) {
                                if (formatDecimal.format(i).endsWith("0")) {
                                        System.out.println("I=" + formatDecimal.format(i).substring(0, 1) + " J=" + formatDecimal.format(j).substring(0, 1));}
                                else {
                                        System.out.println("I=" + formatDecimal.format(i) + " J=" + formatDecimal.format(j));}
                                j++;
                        }
                        j-=3;
                        j+=0.2;
                        i+=0.2;
                }
        }

}
