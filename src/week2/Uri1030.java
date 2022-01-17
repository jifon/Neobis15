package week2;

import java.util.*;

public class Uri1030 {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        int N=scann.nextInt();

        for (int k=1;k<N+1;k++)
        {
            int n = scann.nextInt();
            int step = scann.nextInt();

            Queue<Integer> queue = new LinkedList<Integer>();

            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }

            int a=0;

            while (!queue.isEmpty())
            {
                for (int i = 0; i < step-1; i++){
                    queue.add(queue.remove());
                }
                a=queue.remove();
            }
            System.out.println("Case "+k+": "+a);
        }
    }
}
