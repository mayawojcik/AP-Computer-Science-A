package Q1.Prog93Cl;

public class Cl93a {
    private int kwh;
    private double baseRate;
    private double surCharge;
    private double cityTax;
    private double total;
    private double lateTotal;

    public Cl93a(int kwh) {
        // this(java) = self(python)
        this.kwh = kwh;
        baseRate = 0;
        surCharge = 0;
        cityTax = 0;
        total = 0;
        lateTotal = 0;
    }


    public void calc() {
        baseRate = Math.round((this.kwh * 0.0475) * 100) / 100.0;
        surCharge = Math.round((baseRate * 0.1) * 100) / 100.0;
        cityTax = Math.round((baseRate * 0.03) * 100) / 100.0;
        total = Math.round((cityTax + surCharge + baseRate) * 100) / 100.0;
        lateTotal = Math.round(((total * 0.04) + total) * 100) / 100.0;
    } // TODO

    public String toString() {
        return "KWH Used: " + kwh +
                "\nBase Rate: " + baseRate +
                "\nSurcharge: " + surCharge +// TODO: the rest
                "\nCity Tax: " + cityTax +
                "\nTotal: " + total +
                "\nlateTotal: " + lateTotal;
    }
}
