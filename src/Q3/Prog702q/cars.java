package Q3.Prog702q;

public class cars extends vehicle {
    final private double myMoney;

    public cars(String names, int tires, double money, double value) {
        super(names, tires, value);
        myMoney = money;
    }
    public double getMoney() { return myMoney; }
}
