package Q3.Prog702p;

public class Wallies extends Animals {
    private double mySteps;

    public Wallies(String name, double steps) {
        super(name);
        mySteps = steps;
    }
    public String getSteps() { return mySteps; }
}
