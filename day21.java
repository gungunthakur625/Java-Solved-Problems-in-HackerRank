import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt()) 
        return;   
        int testCases = in.nextInt();
        in.nextLine(); 

        for (int i = 0; i < testCases; i++) {
            if (!in.hasNextLine()) break; 
            String pattern = in.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
