import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        Matcher matcher = Pattern.compile("[A-Za-z]+").matcher(s);

        ArrayList<String> tokens = new ArrayList<>();

        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        System.out.println(tokens.size());
        for (String token : tokens) {
            System.out.println(token);
        }
    }

}
