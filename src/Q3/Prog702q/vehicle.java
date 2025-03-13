package Q3.Prog702q;

public class vehicle {
    public String getName;
    public int getTire;
    public double getWorth;

    public vehicle(String names, int tires) {
        getName = names;
        getTire = tires;
        getWorth = 0;
    }

    public String getName() { return getName; }
    public int getTires() { return getTire; }
    public double getWorth() { return getWorth; }
}
