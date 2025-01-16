package Q2.Prog402a;

public class Cl402a {
    private double myAvg = 0.0;
    private int[] myID = new int[100];
    private int[] myScore = new int[100];

    public Cl402a(int[] id, int[] score) {
        myID = id;
        myScore = score;
    }

    public void calc() {
        int count = myID.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += myScore[i];
        }
        myAvg = (double) sum / count;
    }

    public void output(int count) {
        System.out.print("ID\t\tScore\t\t\tDifference\n");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d\t\t%d\t\t %.2f\n", myID[i], myScore[i], (myScore[i] - myAvg));
        }
    }
}