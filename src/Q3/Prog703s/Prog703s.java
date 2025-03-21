package Q3.Prog703s;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));
            int AColor = 0;
            int LCode = 0;
            int WVer = 0;

            while (file.hasNext()) {
                int type = file.nextInt();
                String name = file.nextLine();
                int num = file.nextInt();
                double val = file.nextDouble();
                if (type == 1) {
                    String color = file.nextLine();
                    Apple vroom = new Apple(name, num, val, color);
                    if (color.equals("green") || color.equals("gold")) {
                         AColor++;
                    }
                }
                if (type == 2) {
                    double verNum = file.nextDouble();
                    Windows beep = new Windows(name, num, val, verNum);
                    if (verNum == 7.0)
                        WVer++;
                }
                if (type == 3) {
                    int hCode = file.nextInt();
                    Linux round = new Linux(name, num, val, hCode);
                    if (hCode % 5 == 0)
                        LCode++;
                }
                else {
                    return;
                }
                System.out.println("Number of window machines that are on version 7.0 are " + WVer);
                System.out.println("Number of linux machines that have a secret code num that ends in a 5 are " + LCode);
                System.out.println("Number of apple computers that are green or gold are " + AColor);

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
