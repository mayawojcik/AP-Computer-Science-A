package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.printf("%s\t%f\t%d\t%$.2f\n"
                cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = file.nextInt();
            file.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numCats; lcv++) {
                String n = file.nextLine();
                double w = file.nextDouble();
                int a = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();
                cats[lcv] = new Cat(n, w, a ,c);
            }

            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++)
                printCat(cats[lcv]);

            System.out.println("2. The third cat is named: " + cats[2].getName());

            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());

            //4
            int rascalIndex = 0;
            for (int i = 0; i < numCats; i++)
                if (cats[i].getName().equals("Rascal"))
                    rascalIndex = i;
            for ( int i = rascalIndex; i < numCats-1; i++)
                cats[i] = cats[i+1];
            numCats--;

            //5
            // for (int i = numCats + 1; i -->1;)
            for (int i = numCats; i > 1; i--)
                cats[i] = cats[i-1];
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;

            //6
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;

            //7
            System.out.println("\n.7 The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats)
                if (cat != null) printCat(cat);

            //8
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            //9
            Cat tempcat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempcat;

            //10
            System.out.println("\n10. The current cat names are: ");
            for ( Cat cat : cats)
                if (cat != null) System.out.print(cat.getName() + "\t");
            System.out.println();






            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/**
 * Cat
 * Use with Cats with BigArrayLists
 */
public class Cat {
    private String myName;
    private double myWeight;
    private int myAge;
    private double myCost;

    public Cat() {
        myName = "";
        myWeight = 0;
        myAge = 0;
        myCost = 0;
    }

    public Cat(String name, double weight, int age, double cost) {
        myName = name;
        myWeight = weight;
        myAge = age;
        myCost = cost;
    }

    /**
     * Methods
     */
    public void setWeight(double weight) { myWeight = weight; }
    public void setCost(double cost) { myCost = cost; }
    public void setAge(int age){ myAge = age; }
    public void setName(String name) { myName = name; }

    public int getAge() { return myAge; }
    public double getCost() { return myCost; }
    public double getWeight() { return myWeight; }
    public String getName() { return myName; }
}
