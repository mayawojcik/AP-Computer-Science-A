package Q3.Prog702q;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));

            while (file.hasNext()) {
                int type = file.nextInt();
                String name = file.nextLine();
                int tires = file.nextInt();
                double value = file.nextDouble();
                if (type == 1) {
                    cars vroom = new cars(name, tires, value, money);
                }
                if (type == 2) {
                    trucks beep = new trucks(name, tires, value, miles);
                }
                if (type == 3) {
                    buses round = new buses(name, tires,value, homeD);
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
