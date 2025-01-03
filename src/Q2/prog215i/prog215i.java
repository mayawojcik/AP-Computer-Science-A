package Q2.prog215i;

public class prog215i {
    private int myVehicle;
    private double myGallons;
    private double myMiles;
    private double myMPG;
    private double myFleet;

    public void calc() {
        double mpg = myMiles / myGallons;
        myMPG = Math.round((mpg * 100000) / 100000);
    }

    public prog215i(int v, double g, double m) {
        myVehicle = v;
        myGallons = g;
        myMiles = m;
        myMPG = 0;
        myFleet = 0;
    }

    public void setMyVehicle() {this.calc(); }
    public int getMyVehicle() {return myVehicle;}
    public double myGallons() {return myGallons;}
    public double getmymiles() {return myMiles;}
    public double myMPG() {return myMPG;}
    public double myFleet() {return myFleet;}

    public String toString() {
        return myVehicle + "\t" + myMiles + "\t" + myGallons + "\t" + myMPG;
        //return "\n\n" + "MPG Statistics: " + "\n" + "Best: " + "" + "\n" + "Worst: " + "" +
                //"\n" + "Fleet Average: " + "" + "\n" + "Number of Vehicles: " + "";
    }

}

