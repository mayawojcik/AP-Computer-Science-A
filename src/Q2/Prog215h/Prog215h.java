package Q2.Prog215h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215h.txt"));
            ArrayList<Cl215h> list = new ArrayList<Cl215h>();

            while (input.hasNext()) {
                ArrayList<Double> thing = new ArrayList<Double>();
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());
                thing.add(input.nextDouble());

                Cl215h la = new Cl215h(thing);
                list.add(la);
                la.calc();
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl215h la = list.get(lcv);
                la.setCount(lcv+1);
                System.out.println(la.toString() + "\n");
            }

        } catch (IOException e) {

        }
    }
}
/*
Contestant 1
8.4 8.4 8.5 8.7 8.8 9.1 9.1 9.1 = 8.77
Contestant 2
7.0 7.0 7.0 7.0 7.0 7.0 7.0 7.0 = 7.00
Contestant 3
7.9 8.0 8.0 8.0 8.0 8.0 8.0 8.1 = 8.00
Contestant 4
6.1 6.2 7.1 7.2 8.1 8.1 8.2 8.2 = 7.48
Contestant 5
6.3 7.2 7.3 7.5 7.7 7.8 8.8 9.2 = 7.72
Contestant 6
6.3 6.7 6.8 6.9 7.3 7.7 7.9 8.8 = 7.22
 */