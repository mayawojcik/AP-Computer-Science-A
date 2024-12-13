package Q2.CL410t;

public class cl410 {
    private int myId;
    private int myIncome;
    private int myMembers;
    private double myAverage;
    private double myPoverty;

    public void calc() {
        myPoverty = 3750.00 + 750.00 * (myMembers-2);
        myAverage = myIncome / 13.00;
    }

    public cl410(int id, int income, int members) {
        myId = id;
        myIncome = income;
        myMembers = members;
        myAverage = 0;
        myPoverty = 0;
    }

    public void setMyMember() {this.calc(); }
    public int getId() {return myId; }
    public int getIncome() {return myIncome;}
    public int getMembers() {return myMembers;}
    public double getAverage() {return myAverage;}
    public double getPoverty() {return myPoverty;}

    public String toString() {
        return myId + "\t" + myIncome + "\t\t" + myMembers;
    }


}
