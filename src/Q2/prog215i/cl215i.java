package Q2.prog215i;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cl215i {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215i.dat"));

            System.out.println("Vehicle  Miles\tGallons  MPG");

            while (file.hasNext()) {
                int v = file.nextInt();
                double g = file.nextDouble();
                double m = file.nextDouble();

                prog215i thing = new prog215i(v, g, m);
                thing.setMyVehicle();
                System.out.println(thing.toString());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    } 
}

/*
Vehicle  Miles	Gallons  MPG
1005	380.5	15.0	25.0
1003	240.1	12.0	20.0
1006	172.3	9.0	    19.0
1008	317.7	14.0	23.0
1010	390.2	17.0	23.0
1015	152.1	4.0	    38.0
1017	310.0	12.3	25.0
1020	409.9	17.9	23.0
 */