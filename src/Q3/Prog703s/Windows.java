package Q3.Prog703s;

public class Windows {
    private double versionNumber;

    public Windows(String name, int num, double val, double verNum) {
        super(name, num, val);
        versionNumber = verNum;
    }
    public double getVersionNumber() { return versionNumber; }
}
