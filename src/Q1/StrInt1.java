package Q1;
import java.util.Scanner;

public class StrInt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Duplicate characters; ");
        String str = input.nextLine();


        for (int lcv = 0; lcv < str.length(); lcv++) {
            for (int lcv2 = lcv+1; lcv2 < str.length(); lcv2++) {
                String let1 = str.substring(lcv, lcv+1);
                String let2 = str.substring(lcv2, lcv2+1);

                if (let1.equals(let2)) {
                    System.out.print(let2 + " ");
                    break; // break out of current(innermost) loop (basically blank return for loop)
                }
            }
        }
    }
}
