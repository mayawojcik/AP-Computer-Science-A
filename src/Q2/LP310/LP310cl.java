package Q2.LP310;

public class LP310cl {
    private int burger;
    private int fries;
    private int soda;
    private double tendered;
    private double total;
    private double tax;
    private double totaltax;
    private double change;
    private double totalr;
    private double taxr;
    private double changer;


    public LP310cl(int burger, int fries, int soda, double tendered) {
        this.burger = burger;
        this.fries = fries;
        this.soda = soda;
        this.tendered = tendered;
        total = 0;
        totalr = 0;
        tax = 0;
        taxr = 0;
        totaltax = 0;
        change = 0;
        changer = 0;

    }

    public void calc(){
        total = (this.burger * 1.69) + (this.fries * 1.09) + (this.soda * 0.99);
        totalr = Math.round(total * 100.0) / 100.0;
        tax = total * 0.065;
        taxr = Math.round(tax * 100.0) / 100.0;
        totaltax = totalr + taxr;
        change = this.tendered - totaltax;
        changer = Math.round(change * 100.0) / 100.0;

    }

    public String toString(){
        return "Amount of burgers: " + this.burger + "\n" +
                "Amount of fries: " + this.fries + "\n" +
                "Amount of soda: " + this.soda + "\n" +
                "Total before tax: $" + totalr + "\n" +
                "Tax: $" + taxr + "\n" +
                "Final total: $" + totaltax + "\n" +
                "Amount tendered: $" + this.tendered + "\n" +
                "Change: $" + changer;
    }
}
