package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
   /* private static ArrayList<Horse> myHorses;
    private static ArrayList<Cow> myCows;
    private static int myNumHayBales;
    private static int myNumCorn;
    private static double myHayCost;
    private static double myCornCost;

    public static void main(String[] args) {
        try {
            Scanner sydney = new Scanner(new File("Langdat/prog505t.dat"));
            myCows = new ArrayList<>();
            myHorses = new ArrayList<>();
            myNumHayBales = sydney.nextInt();
            myHayCost = sydney.nextDouble();
            myNumCorn = sydney.nextInt();
            myCornCost = sydney.nextDouble();
            int amt = sydney.nextInt();
            for (int k = 0; k < amt; k++) {
                myCows.add(new Cow(sydney.nextInt(), sydney.nextInt(), sydney.nextInt(), sydney.nextInt()));
            }
            amt = sydney.nextInt();
            for (int u = 0; u < amt; u++) {
                myHorses.add(new Horse(sydney.nextInt(), sydney.nextInt(), sydney.nextInt(), sydney.nextInt(), sydney.nextDouble()));
            }
            Farm myFarm = new Farm(myHorses, myCows, myNumHayBales, myNumCorn, myHayCost, myCornCost);
            System.out.println(myFarm.farmIncome());
            System.out.println(myFarm.getCost());
            System.out.println(myFarm.getWeight());
            if (myFarm.feedAllAnimals() == true) {
                System.out.println("There is enough food to feed all animals!");
                System.out.println("Hay: " + myFarm.getHayBales() + "    Corn: " + myFarm.getCorn());
            } else {
                System.out.println("There is not enough food to feed all animals! Shipment is required!!");
            }
            for (int m = 0; m < 3; m++) {
                int lowestMilk = Integer.MAX_VALUE;
                int lowestCowIndex = 0;
                for (int o = 0; o < myFarm.getCows().size(); o++) {
                    if (myFarm.getCows().get(o).getMilk() < lowestMilk) {
                        lowestMilk = myFarm.getCows().get(o).getMilk();
                        lowestCowIndex = o;
                    }
                }
                myFarm.removeCow(lowestCowIndex);
                System.out.println("The cow is removed at index " + lowestCowIndex + "!");
            }
            for (int z = 0; z < 2; z++) {
                double lowestIncome = Integer.MAX_VALUE;
                int lowestHorseIndex = 0;
                for (int x = 0; x < myFarm.getHorses().size(); x++) {
                    if (myFarm.getHorses().get(x).getRideCost() < lowestIncome) {
                        lowestIncome = myFarm.getHorses().get(x).getRideCost();
                        lowestHorseIndex = x;
                    }
                }
                myFarm.removeHorse(lowestHorseIndex);
                System.out.println("The horse is removed at index " + lowestHorseIndex + "!");
            }

            myFarm.getCows().get(0).setCow(1250, 80, 3, 4);

            System.out.println("The total number of cows is: " + myFarm.getCows().size() + "!"
                    + "\nThe total number of Horses is: " + myFarm.getHorses().size() + "!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }*/
}