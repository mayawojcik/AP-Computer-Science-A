package Q3.Prog702q;
public class vehicle implements names {
    public String getName;
    public int getTire;
    public double getValue;

    public vehicle(String names, int tires, double value) {
        getName = names;
        getTire = tires;
        getValue = value;
    }

    public String getName() { return getName; }
    public int getTire() { return getTire; }
    public double getWorth() { return getValue; }
}
