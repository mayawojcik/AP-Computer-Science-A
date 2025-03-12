package Q3.Prog702q;

public class trucks extends vehicle {
    private double getMiles;

    public trucks(String names, int tires, double miles) {
        super(names, tires);
        getMiles = miles;
    }
    public double getMiles() { return getMiles; }
}
