package Q3.Prog702q;

public class buses extends vehicle {
    final private String myHomeDestination;

    public buses(String names, int tires, String homeD, double value) {
        super(names, tires, value);
        myHomeDestination = homeD;
    }
    public String getHomeDestination() { return myHomeDestination; }
}
