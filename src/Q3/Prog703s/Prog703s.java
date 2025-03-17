package Q3.Prog703s;
import Q3.Prog702q.buses;
import Q3.Prog702q.cars;
import Q3.Prog702q.trucks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.dat"));

            while (file.hasNext()) {
                int type = file.nextInt();
                String name = file.nextLine();
                int num = file.nextInt();
                double val = file.nextDouble();
                if (type == 1) {
                    Apple vroom = new cars(name, num, val, color);

                }
                if (type == 2) {
                    Windows beep = new trucks(name, num, val, verNum);

                }
                if (type == 3) {
                    Linux round = new buses(name, num, val, hCode);

                }
                else {
                    return;
                }

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
