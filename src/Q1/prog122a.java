package Q1;
import java.util.*;

public class prog122a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lcv = 0;
        int squared = (int)Math.pow(1-50, 2);
        while (lcv <= 48+1) {
            lcv += 1;
            System.out.println(lcv + " " + squared);
        }


    }
}
