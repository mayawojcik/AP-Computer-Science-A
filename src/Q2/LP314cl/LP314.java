package Q2.LP314cl;
import Q2.LP310.LP310cl;

import java.util.*;

public class LP314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print  ("                Awbrey    Martinez");
        System.out.println("\nNew Jersey:     ");
        System.out.print  ("");
        int AwNj = input.nextInt();
        System.out.print  ("");
        int MaNj = input.nextInt();
        System.out.println("\nNew York:       ");
        System.out.print  ("");
        int AwNy = input.nextInt();
        System.out.print  ("");
        int MaNy = input.nextInt();
        System.out.println("\nConnecticut:    ");
        System.out.print  ("");
        int AwC = input.nextInt();
        System.out.print  ("");
        int MaC = input.nextInt();

        LP314cl cat = new LP314cl(AwNj, MaNj, AwNy, MaNy, AwC, MaC);
        cat.calc();

        System.out.println(cat);
    }
}
/*
New Jersey:
89008
121032
New York:
314159
271860
Connecticut:
213451
231034
 */
/*
Election results for New York:
Awbrey: 89008
Martinez: 121032

Election results for New Jersey:
Awbrey: 314159
Martinez: 271860

Election results for Connecticut:
Awbrey: 213451
Martinez: 231034

Candidate              Votes   Percentage
Awbrey                 616618   49.71
Martinez               623926   50.29
TOTAL VOTES:           1240544.0

Process finished with exit code 0

 */





