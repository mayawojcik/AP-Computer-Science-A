package Q2.CL410t;

public class cl410 {
    private int myId;
    private int myIncome;
    private int myMembers;
    private int myId1;
    private int myIncome1;
    private int myMembers1;
    private double myAverage;
    private double myPoverty;

    public void calc() {
        myPoverty = 3750.00 + 750.00 * (myMembers-2);
        for (int lcv = 0; lcv < nums.length; lcv++)
        if (lcv > 12707 && myIncome1 > 12707)
        myAverage = myIncome / 13.00;
    }

    public cl410(int id, int income, int members, int id1, int income1, int members1) {
        myId = id;
        myIncome = income;
        myMembers = members;
        myId1 = id1;
        myIncome1 = income1;
        myMembers1 = members1;
        myAverage = 0;
        myPoverty = 0;
    }


    public void setMyMembers() {this.calc(); }
    public int getId() {return myId; }
    public int getIncome() {return myIncome;}
    public int getMembers() {return myMembers;}
    public double getAverage() {return myAverage;}
    public double getPoverty() {return myPoverty;}

    public String toString() {
        return myId + "\t" + myIncome + "\t\t" + myMembers;
    }
}
