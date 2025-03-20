package Q3.Prog703s;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));

            while (file.hasNext()) {
                int type = file.nextInt();
                String name = file.nextLine();
                int num = file.nextInt();
                double val = file.nextDouble();
                if (type == 1) {
                    String color = file.nextLine();
                    Apple vroom = new Apple(name, num, val, color);

                }
                if (type == 2) {
                    double verNum = file.nextDouble();
                    Windows beep = new Windows(name, num, val, verNum);

                }
                if (type == 3) {
                    int hCode = file.nextInt();
                    Linux round = new Linux(name, num, val, hCode);

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
