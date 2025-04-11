package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner sydney = new Scanner(new File("Langdat/prog505t.dat"));
            List<Animal> animals = new ArrayList<>();

            while (sydney.hasNext()) {
                //income of the day

                //cost of feeding

                //cumulative weight

                //determine if there is enough food
                //report how many bales of hay and cobs are left in the barn

                //sell off the 3 cows with low milk

                //sell off 3 horses with low income

                // Change the first cow.
                // The cow has a weight of 1250,
                // followed by 80 pounds of milk produced per day,
                // followed by the number of 3 hay bales eaten each day,
                // followed by 4 corncobs eaten each day.

                //report tot num of cows and horses


            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
