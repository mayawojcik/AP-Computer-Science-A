package Q3.Prog703s;

public class Windows extends Computer {
    private double myVersionNumber;

    public Windows(String name, int num, double val, double verNum) {
        super(name, num, val);
        myVersionNumber = verNum;
    }
    public double getVersionNumber() { return myVersionNumber; }
}
