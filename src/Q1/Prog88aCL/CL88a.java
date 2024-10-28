package Q1.Prog88aCL;

public class CL88a {
    private int num1;
    private int num2;
    private int sum;
    private int difference;
    private int product;
    private int average;
    private int absoluteValue;
    private int maximum;
    private int minimum;

    public CL88a(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        sum = 0;
        difference = 0;
        product = 0;
        average = 0;
        absoluteValue = 0;
        maximum = 0;
        minimum = 0;
    }

    public void calc(){
        sum = this.num1 + this.num2;
        difference = this.num1 - this.num2;
        product = this.num1 * this.num2;
        average = (this.num1 + this.num2) / 2;
        absoluteValue = Math.abs(this.num1 - this.num2);
        maximum = Math.max(this.num1, this.num2);
        minimum = Math.min(this.num1, this.num2);
    }

    public String toString() {
        return "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Average: " + average + "\n" +
                "Absolute Value: " + absoluteValue + "\n" +
                "Maximum: " + maximum + "\n" +
                "Minimum: " + minimum;
    }
}
