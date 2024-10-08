package Q1;
import java.util.*;

public class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter package weight in kilograms: ");
        int kg = input.nextInt();
        System.out.print("Enter package length in centimeters: ");
        int length = input.nextInt();
        System.out.print("Enter package width in centimeters: ");
        int width = input.nextInt();
        System.out.print("Enter package height in centimeters: ");
        int height = input.nextInt();
        int dimensions = (length * width * height);

        String outputkg = "";
        if (kg >= 27) outputkg = "Too Heavy";
        else          outputkg = " ";

        String outputd = "";
        if (dimensions >= 100000) outputd = "Too large";
        else                      outputd = " ";

        System.out.println("Your package is " + outputkg + " " + outputd);



    }
}
/*
Enter package weight in kilograms: 32
Enter package length in centimeters: 10
Enter package width in centimeters: 25
Enter package height in centimeters: 38
Your package is Too Heavy
 */