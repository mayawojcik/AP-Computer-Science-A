package Q3.Prog702q;

public class trucks extends vehicle {
    final private double myMiles;

    public trucks(String names, int tires, double miles, double value) {
        super(names, tires, value);
        myMiles = miles;
    }
    public double getMiles() { return myMiles; }
}
