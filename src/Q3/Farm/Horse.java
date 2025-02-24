package Q3.Farm;

public class Horse extends Animal {
    private int myNumRides;
    private double myRideCost;

    public Horse(String name, int weight, int corn, int hay, int rides, double costs) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = costs;
    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myRideCost - getFeedCost(cornCost, hayCost);
    }

    @Override
    public String getName() {return super.getName() + super.getName();}
    public int getRides() {return myNumRides;}
    public double getRideCost() {return myRideCost;}
}
