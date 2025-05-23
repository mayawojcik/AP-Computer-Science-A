package Q2.Prog435a;

public class Cl435a {
    private String[] myfact = new String[100];
    private double[] myty = new double[100];
    private double[] mytotal = new double[100];
    private double[] myprice = new double[100];
    private int[] mytype = new int[100];
    private int[] mygate = new int[100];

    public Cl435a(String[] fact, double[] ty, double[] total, double[] price, int[] type, int[] gate) {
        myfact = fact;
        myty = ty;
        mytotal = total;
        myprice = price;
        mytype = type;
        mygate = gate;
    }

    public void calc() {
        int count = mytype.length;
        for (int i = 0; i < count; i++) {
            if (mytype[i] == 1) {
                myfact[i] = "Compact Car";
                myty[i] = 1.0;
            } else if (mytype[i] == 2) {
                myfact[i] = "Small Car";
                myty[i] = 1.3;
            } else if (mytype[i] == 3) {
                myfact[i] = "Mid Size Car";
                myty[i] = 1.6;
            } else if (mytype[i] == 4) {
                myfact[i] = "Full size Car";
                myty[i] = 2.0;
            } else if (mytype[i] == 5) {
                myfact[i] = "Truck";
                myty[i] = 2.4;
            } else if (mytype[i] == 6) {
                myfact[i] = "16 Wheeler";
                myty[i] = 2.7;
            }
            if (mygate[i] == 1) {
                myprice[i] = 1.35;
            } else if (mygate[i] == 2) {
                myprice[i] = 2.00;
            } else if (mygate[i] == 3) {
                myprice[i] = 2.50;
            } else if (mygate[i] == 4) {
                myprice[i] = 3.25;
            } else if (mygate[i] == 5) {
                myprice[i] = 4.10;
            } else if (mygate[i] == 6) {
                myprice[i] = 4.80;
            } else if (mygate[i] == 7) {
                myprice[i] = 5.50;
            } else if (mygate[i] == 8) {
                myprice[i] = 6.00;
            }
            mytotal[i] = myprice[i] * myty[i];
        }
    }

    public String[] getFact() {
        return myfact;
    }
    public double[] getTy() {
        return myty;
    }
    public double[] getTotal() {
        return mytotal;
    }
    public double[] getPrice() {
        return myprice;
    }
    public int[] getType() {
        return mytype;
    }
    public int[] getGate() {
        return mygate;
    }

    public void toString(int count) {
        System.out.printf("Car Type\t\tBase Toll\t\tFactor\t\tCost\n");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", myfact[i], myprice[i],
                    myty[i], mytotal[i]);
        }
    }
}