package Q3.Prog702q;

public class trucks extends vehicle {
    private double getMiles;

    public trucks(String names, int tires, double miles, double value) {
        super(names, tires, value);
        getMiles = miles;
    }
    public double getMiles() { return getMiles; }
}
