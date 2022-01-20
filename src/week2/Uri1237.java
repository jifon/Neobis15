package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Uri1237 {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String str1, str2, max, min;

        while ((str1 = bufferedReader.readLine()) != null) {
            str2 = bufferedReader.readLine();
            if (str1.length() >= str2.length()) {
                max = str1;
                min = str2;
            } else {
                max = str2;
                min = str1;
            }
            int minLength = min.length();
            int maxStr = minLength;
            boolean f = true;
            while (maxStr > 0 && f) {
                int diff = minLength - maxStr;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxStr))) {
                        f = false;
                        maxStr++;
                        break;
                    }
                }
                maxStr--;
            }
            System.out.println(maxStr);
        }
        printWriter.close();
    }
}