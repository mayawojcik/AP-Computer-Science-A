package Q1prog76aCL;

public class CL76a {
    private int dislike;
    private int product1;
    private int surprise;

    public CL76a(int dislike) {
        this.dislike = dislike;
        product1 = 0;
        surprise = 0;
    }

    public void calc() {
        product1 = this.dislike * 9;
        surprise = product1 * 12345679;
    }

    public String toString() {
        return "9 x" + "\n----" + "\n" +
                product1 + "\n12345679 x" + "\n----------" + "\n" +
                surprise + "  Surprise!";
    }
}
