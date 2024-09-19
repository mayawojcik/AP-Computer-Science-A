package Q1;
import java.util.*;

public class prog122a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lcv = 0;
        while (lcv <= 48+1) {
            lcv += 1;
            int squared = (int)Math.pow(lcv, 2);
            double sqrt = (double)Math.sqrt(lcv);
            System.out.println(lcv + " " + squared + " " + sqrt);

        }


    }
}
