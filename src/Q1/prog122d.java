package Q1;
import java.util.*;

public class prog122d {
    public static void main(String[] args) {
        int lcv = -13;
        while (lcv <= 15) {
            lcv += 1;
            int lcv6 = (int)Math.pow(lcv, 6);
            int lcv5 = (int)Math.pow((3 * lcv), 5);
            int lcv4 = (int)Math.pow((93 * lcv), 4);
            int lcv3 = (int)Math.pow((87 * lcv), 3);
            int lcv2 = (int)Math.pow((1596 * lcv), 2);
            int lcv1 = (1380 * lcv);
            int y1 = (((int)Math.pow(lcv, 6) - (int)Math.pow((3 * lcv), 5)) - (int)Math.pow((93 * lcv), 4));
            int y = (((((lcv6 - lcv5) - lcv4) + lcv3) + lcv2) - lcv1) - 2800;
            System.out.println(lcv + "   " + y);
        }
    }
}
