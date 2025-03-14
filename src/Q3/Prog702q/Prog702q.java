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
                int tires = file.nextInt();
                double value = file.nextDouble();
                if (type == 1) {
                    cars vroom = new cars(names, tires, value, money);

                }
                if (type == 2) {
                    trucks beep = new trucks(names, tires, value, miles);

                }
                if (type == 3) {
                    buses round = new buses(names, tires,value, homeD);

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
