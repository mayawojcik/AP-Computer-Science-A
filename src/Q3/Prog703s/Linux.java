package Q3.Prog703s;

public class Linux {
    private int hiddenCode;

    public Linux(String name, int num, double value, int hCode) {
        super(name, num, value);
        hiddenCode = hCode;
    }
    public int getHiddenCode() { return hiddenCode; }
}
