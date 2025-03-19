package Q3.Prog702q;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));

            while (file.hasNext()) {
                int type = file.nextInt();
                String names = file.nextLine();
                int cTires = file.nextInt();
                int tTires = file.nextInt();
                int bTires = file.nextInt();
                double value = 0.0;

                if (type == 1) {
                    cars vroom = new cars(names, cTires, value, money);


                }
                if (type == 2) {
                    trucks beep = new trucks(names, tTires, value, miles);
                    value = 50000 - (miles * 0.25);

                }
                if (type == 3) {
                    buses round = new buses(names, bTires, value, homeD);
                    value = 50000;

                }
                else {
                    return;
                }

                System.out.println("Total number of vehicles are: ");
                System.out.println("Total worth of cars: ");
                System.out.println("Total worth of vehicles: ");
                System.out.println("Longest home destination name: ");
                System.out.println("Truck with the least value: ");
                System.out.println("Number of car tires: ");
                System.out.println("Number of truck tires: ");
                System.out.println("Number of bus tires: ");

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
