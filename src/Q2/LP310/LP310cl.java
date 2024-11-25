package Q2.LP310;

public class LP310cl {
    private double burger;
    private double fries;
    private double soda;
    private double tendered;
    private double total;
    private double tax;
    private double totaltax;
    private double change;


    public LP310cl(double burgers, double fries, double soda, double tendered) {
        this.burger = burger;
        fries = 0;
        soda = 0;
        tendered = 0;
        total = 0;
        tax = 0;
        totaltax = 0;
        change = 0;

    }

    public void calc(){
        total = (this.burger*1.69) + (fries*1.09) + (soda*0.99);
        tax = total + 0.065;
        totaltax = total + tax;
        change = tendered - totaltax;

    }

    public String toString(){
        return this.burger + "\n\n" +
                fries + "\n\n" +
                soda + "\n\n" +
                "Total before tax: " + total + "\n\n" +
                "Tax: " + tax + "\n\n" +
                "Final total: " + totaltax + "\n\n";
    }
}
