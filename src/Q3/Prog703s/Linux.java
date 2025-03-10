package Q3.Prog703s;

public class Linux {
    private int myHiddenCode;

    public Linux(String name, int num, double value, int hCode) {
        super(name, num, value);
        myHiddenCode = hCode;
    }
    public int getHiddenCode() { return myHiddenCode; }
}
