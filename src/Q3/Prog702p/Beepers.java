package Q3.Prog702p;

public class Beepers extends Animals {
    private String myWordSize;

    public Beepers(String name, String size) {
        super(name);
        myWordSize = size;
    }
    public String getWordSize() { return myWordSize; }
}
