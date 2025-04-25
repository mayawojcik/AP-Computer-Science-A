package Q3.Farm;
import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm(ArrayList<Horse> Horses, ArrayList<Cow> Cows, int numHayBales, int numCorn, double hayCost, double cornCost) {
        myHorses = Horses;
        myCows = Cows;
        myNumHayBales = numHayBales;
        myNumCorn = numCorn;
        myHayCost = hayCost;
        myCornCost = cornCost;
    }

    private boolean feedCows() {
        int tempHay = myNumHayBales;
        int tempCorn = myNumCorn;
        for (int l = 0; l < myCows.size(); l++) {
            tempHay -= myCows.get(l).getHayBales();
            tempCorn -= myCows.get(l).getCorn();
        }
        if (tempHay >= 0 && tempCorn >= 0) {
            myNumHayBales = tempHay;
            myNumCorn = tempCorn;
            return true;
        }
        return false;
    }

    private boolean feedHorses() {
        int tempHay = myNumHayBales;
        int tempCorn = myNumCorn;
        for (int x = 0; x < myHorses.size(); x++) {
            tempHay -= myHorses.get(x).getHayBales();
            tempCorn -= myHorses.get(x).getCorn();
        }
        if (tempHay >= 0 && tempCorn >= 0) {
            myNumHayBales = tempHay;
            myNumCorn = tempCorn;
            return true;
        }
        return false;
    }

    public boolean feedAllAnimals() {
        int tempHay = myNumHayBales;
        int tempCorn = myNumCorn;
        for (int s = 0; s < myCows.size(); s++) {
            tempHay -= myCows.get(s).getHayBales();
            tempCorn -= myCows.get(s).getCorn();
        }
        for (int e = 0; e < myHorses.size(); e++) {
            tempHay -= myHorses.get(e).getHayBales();
            tempCorn -= myHorses.get(e).getCorn();
        }
        if (tempHay >= 0 && tempCorn >= 0) {
            myNumHayBales = tempHay;
            myNumCorn = tempCorn;
            return true;
        }
        return false;
    }

    private double cowIncome(double perPound)  {
        double income = 0;
        for (int q = 0; q < myCows.size(); q++) {
            income += perPound * myCows.get(q).getMilk();
        }
        return income;
    }
    private double horseIncome() {
        double income = 0;
        for (int a = 0; a < myHorses.size(); a++) {
            income += myHorses.get(a).getRides() * myHorses.get(a).getRideCost();
        }
        return income;
    }
    public double farmIncome() {
        return cowIncome(0.20) + horseIncome();
    }

    public int getWeight() {
        int weight = 0;
        for (int v = 0; v < myCows.size(); v++) {
            weight += myCows.get(v).getWeight();
        }
        for (int b = 0; b < myHorses.size(); b++) {
            weight += myHorses.get(b).getWeight();
        }
        return weight;
    }

    public double getCost() {
        int tempHay = 0;
        int tempCorn = 0;
        for (int t = 0; t < myCows.size(); t++) {
            tempHay += myCows.get(t).getHayBales();
            tempCorn += myCows.get(t).getCorn();
        }
        for (int w = 0; w < myHorses.size(); w++) {
            tempHay += myHorses.get(w).getHayBales();
            tempCorn += myHorses.get(w).getCorn();
        }
        return (tempHay * myHayCost) + (tempCorn * myCornCost);
    }
    public ArrayList<Cow> getCows() {
        return myCows;
    }
    public ArrayList<Horse> getHorses() {
        return myHorses;
    }
    public int getHayBales() {
        return myNumHayBales;
    }
    public int getCorn() {
        return myNumCorn;
    }
    public void removeCow(int index) {myCows.remove(index);}
    public void removeHorse(int index) {myHorses.remove(index);}
}