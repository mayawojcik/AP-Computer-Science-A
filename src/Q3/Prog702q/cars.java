package Q3.Prog702q;

public class cars extends vehicle {
    private double getMoney;

    public cars(String names, int tires, double money) {
        super(names, tires);
        getMoney = money;
    }
    public double getMoney() { return getMoney; }
}
