package Q3.Prog702p;

public class Hiccas extends Animals{
    private double myFurWorth;

    public Hiccas(String name, double furWorth) {
        super(name);
        myFurWorth = furWorth;
    }
    public double getFurWorth() { return myFurWorth; }
}
