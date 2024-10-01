package Q1;
import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = wow.nextLine().toLowerCase().trim();
        String str = wow.nextLine();

        for (int lcv = 0; lcv < text.length(); lcv++) {
            for (int lcv2 = lcv + 1; lcv2 < str.length(); lcv2++) {
                String let1 = str.substring(lcv, lcv + 1);
                String let2 = str.substring(lcv2, lcv2 + 1);
                if (!let1.equals(let2)) {
                    System.out.print(let2 + " ");
                    System.out.printf("# unique variables %d\n", let2);
                }
            }
        }
    }
}
