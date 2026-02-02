import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int Q = sc.nextInt();

        while (Q-- > 0) {
            String command = sc.next();

            if (command.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            } else if (command.equals("Delete")) {
                int x = sc.nextInt();
                list.remove(x);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}