package Q3.Prog702q;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));
            int totV = 0;
            double totVal = file.nextDouble();
            double totCVal = file.nextDouble();
            String desName = "";
            double leastVal = file.nextDouble();
            int carTires = file.nextInt();
            int truckTires = file.nextInt();
            int busTires = file.nextInt();

            while (file.hasNext()) {
                totV++;
                int type = file.nextInt();
                String names = file.next();
                int tires = file.nextInt();
                double value = 0.0;

                if (type == 1) {
                    double money = file.nextDouble();
                    cars sydney = new cars(names, tires, value, money);
                    carTires += tires;
                    totVal += value;
                    totCVal += value;

                }
                if (type == 2) {
                    double miles = file.nextDouble();
                    value = 50000 - (miles * 0.25);
                    trucks marlon = new trucks(names, tires, value, miles);
                    truckTires += tires;
                    totVal += value;
                    if (leastVal < value)
                        leastVal = value;

                }
                if (type == 3) {
                    String homeD = file.next();
                    value = 50000;
                    buses maya = new buses(names, tires, homeD, value);
                    busTires += tires;
                    totVal += value;
                    if (desName.length() < homeD.length())
                        desName = homeD;
                } else
                    return;


            System.out.println("Total number of vehicles are: " + totV);
            System.out.println("Total worth of cars: " + totCVal);
            System.out.println("Total worth of vehicles: " + totVal);
            System.out.println("Longest home destination name: " + desName);
            System.out.println("Truck with the least value: " + leastVal);
            System.out.println("Number of car tires: " + carTires);
            System.out.println("Number of truck tires: " + truckTires);
            System.out.println("Number of bus tires: " + busTires);
        }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
