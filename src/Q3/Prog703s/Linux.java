package Q3.Prog703s;

public class Linux extends Computer {
    private int myHiddenCode;

    public Linux(String name, int num, double val, int hCode) {
        super(name, num, val);
        myHiddenCode = hCode;
    }
    public int getHiddenCode() { return myHiddenCode; }
}
