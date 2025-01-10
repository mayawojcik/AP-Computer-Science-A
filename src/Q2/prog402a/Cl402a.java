package Q2.prog402a;

public class Cl402a {
    private int myScore;
    private double myDiff;
    private double myAvg;

    public void calc() {
        for (int i = 0; i < myScore; i++) {
            myDiff += i;
            myAvg = myDiff / 21.0;
        }
    }

    public Cl402a(int s) {
        myScore = s;
        myDiff = 0;
        myAvg = 0;
    }

}
