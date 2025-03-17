package Q3.Prog703s;

public class Computer implements comps {
    private String getName;
    private int getNumber;
    private double getValue;

    public Computer(String name, int num, double val) {
        getName = name;
        getNumber = num;
        getValue = val;
    }
    public String getName() { return getName; }
    public int getNumber() { return getNumber; }
    public double getValue() { return getValue; }
}
