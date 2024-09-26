package Q1;
import java.util.*;

public class prog122i {
    public static void main(String[] args) {
        int lcv = -26;
        while (lcv <= 24) {
            lcv += 1;
            double cuberoot = (double)Math.pow(lcv, 0.3);
            double cuberootr = Math.round(cuberoot * 100000.0) / 100000.0;
            double cube = (double)Math.pow(lcv, 3);
            double cuber = Math.round(cube * 100000.0) / 100000.0;
            System.out.println(lcv + "     " + cuberootr + "     " + cuber);
        }
    }
}
