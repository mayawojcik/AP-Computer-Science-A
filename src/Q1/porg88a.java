package Q1;

public class porg88a {
    public static void main(String[] args) {
        // Enter number 1-13
        // Enter number 2-20
        //Math.random() * (max-,in) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        // sum difference average product max min etc
        int sum = num1 + num2;
        int dif = num1 - num2;
        // TODO: product and average //(done)
        int prod = num1 * num2;
        int ave = sum / 2;
        int abs = Math.abs(dif); //absolute value
        int max, min;



        // the code inside 'if' will only run if the condition is true
        if (num1 > num2) {
            max = num1;
            // min = num2
        } else { // else = otherwise
            max = num2;
            // min = num1;
        }

        // check if max and num1 are the same value using ==
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + ave);
        System.out.println("Absolute value = " + abs);
        // TODO: print the rest
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
/*
Original numbers are 10 and 12
Sum = 22
Difference = -2
Product = 120
Average = 11
Absolute value = 2
Maximum = 12
Minimum = 10
 */