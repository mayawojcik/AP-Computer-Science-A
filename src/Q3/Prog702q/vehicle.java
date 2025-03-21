package Q3.Prog702q;
public class vehicle implements names {
    public String myName;
    public int myTire;
    public double myValue;

    public vehicle(String names, int tires, double value) {
        myName = names;
        myTire = tires;
        myValue = value;
    }

    public String getName() { return myName; }
    public int getTire() { return myTire; }
    public double getValue() { return myValue; }
}
