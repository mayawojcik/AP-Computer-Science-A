package Q1.Prog54bCL;

public class CL54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int sum;
    private double average;

    public CL54b(int num1) {
        this.num1 = num1;
        num2 = 821;
        num3 = 369;
        num4 = 562;
        sum = 0;
        average = 0;
    }

    public void calc() {
        sum = this.num1 + num2 + num3 + num4;
        average = (this.num1 + num2 + num3 + num4)/(double)4;
    }

    public String toString() {
        return "The sum of the four numbers is " + sum +
                "\nThe average of the four numbers is " + average;
    }

}
