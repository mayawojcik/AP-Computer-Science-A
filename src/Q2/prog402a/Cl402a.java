package Q2.prog402a;

public class Cl402a {
    private int myID;
    private int myScore;
    private double myDiff;
    private double myAvg;

    public void calc() {
        for (int i = 0; i < myScore; i++) {
            double score =+ i;
            myAvg = score / 21.0;
        }
    }

    public Cl402a(int d, int a) {
        myDiff = d;
        myAvg = a;
    }

    public void setMyAvg() {this.calc();}
    public double myDiff() {return myDiff;}
    public double myAvg() {return myAvg;}

    public String toString() {
        return "Average Score = " + myAvg;
    }
}
