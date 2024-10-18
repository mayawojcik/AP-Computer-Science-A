package Q1;
import java.util.Scanner;

public class LP59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcv = 0;
        System.out.println("x^1\t\t\tx^2\t\t\tx^3\t\t\tx^4\t\t\tx^5");
        while (lcv <= 4+1) {
            lcv += 1;
            int squared = (int)Math.pow(lcv, 2);
            int cubed = (int)Math.pow(lcv, 3);
            int four = (int)Math.pow(lcv, 4);
            int five = (int)Math.pow(lcv, 5);
            System.out.println(lcv + "\t\t\t" + squared + "\t\t\t" + cubed + "\t\t\t"
                    + four + "\t\t\t" + five);

        }
    }
}
/*
x^1			x^2			x^3			x^4			x^5
1			1			1			1			1
2			4			8			16			32
3			9			27			81			243
4			16			64			256			1024
5			25			125			625			3125
6			36			216			1296		7776
 */