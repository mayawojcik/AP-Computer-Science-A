package Q1;
import java.util.*;

public class prog122b {
    public static void main(String[] args) {
        int lcv = 0;
        System.out.println("Hours" + " " + "Pay");
        while (lcv <= 39) {
            lcv += 1;
            int pay = lcv * 4;
            System.out.println(lcv + "      " + pay);
        }

    }
}
