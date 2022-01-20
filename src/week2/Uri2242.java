package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Uri2242 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toLowerCase();
        List<Character> list = new ArrayList<>(str.length());

        for(int i = 0; i < str.length(); i++) {
            char charr = str.charAt(i);

            if(charr == 'a' || charr == 'e' || charr == 'i' || charr == 'o' || charr == 'u') {
                list.add(charr);
            }
        }

        boolean bool = true;
        for(int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if(list.get(i) != list.get(j)) {
                bool = false;
                break;
            }
        }

        System.out.println(bool ? "S" : "N");
    }
}