package Q1;
import java.util.*;

public class prog122c {
    public static void main(String[] args) {
        int lcv = 0;
        while (lcv <= 8) {
            lcv += 2;
            int lcv1 = lcv + 1;
            int lcv2 = lcv * 2;
            int lcv3 = (int)Math.pow(lcv, 2);
            System.out.println(lcv + "  " + lcv1 + "  " + lcv2 + "  " + lcv3);
        }

    }
}
/*
2  3  4  4
4  5  8  16
6  7  12  36
8  9  16  64
10  11  20  100
 */