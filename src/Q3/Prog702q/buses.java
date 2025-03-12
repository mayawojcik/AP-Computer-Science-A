package Q3.Prog702q;

public class buses extends vehicle {
    private String getHomeDestination;

    public buses(String names, int tires, String homeD) {
        super(names, tires);
        getHomeDestination = homeD;
    }
    public String getHomeDestination() { return getHomeDestination; }
}
