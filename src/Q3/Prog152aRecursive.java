package Q3;

public class Prog152aRecursive {
    public static int recursion(int n) {
        if (n >= 9669) return 9669;
        return n * recursion(n + 3);
    }
    public static void main(String[] args) {
            System.out.println("The sum of the multiples of 3, from 3 to 9669 is: " + recursion(3));
    }
}
