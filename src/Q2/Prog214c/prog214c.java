package Q2.Prog214c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Cl214c> la = new ArrayList<>();

            while (file.hasNext()) {
                String type = file.nextLine();
                System.out.println(type);
                double gal = file.nextDouble();
                System.out.println(gal);
                String cw = file.nextLine();
                System.out.println(cw);
                Cl214c thing = new Cl214c(type, gal, cw);
                la.add(thing);
            }

            for (int i = 0; i < la.size(); i++) {
                System.out.println("GAS");
                System.out.printf("\nGas Used\t%.2f\t\t= %.2f\n", la.get(i).getGallons(), la.get(i).gasPrice());
                System.out.printf("Car Wash?\t%s\t\t= %.2f\n", la.get(i).getCarWash(), la.get(i).CarWashPrice());
                double total = la.get(i).CarWashPrice() + la.get(i).gasPrice();
                System.out.printf("\nTotal\t  \t\t= %.2f", total);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}