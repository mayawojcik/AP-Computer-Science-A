package Q1;
import java.util.*;

public class GradCalc {
    public static void main(String[] args) {
        // input section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade as a percent: ");
        double gp = input.nextDouble();

        // calculation section
        // boolean test = (gp >= 90); (Rarely use boolean)
        // System.out.println(test);

        String grade = "";
        if (gp >= 90)      grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else               grade = "F";

        // if (gp >= 90) grade = "A";
        // if (gp >= 80 && gp < 90) grade = "B";
        // else if = elif

        // output section
        System.out.println("Your grade is a(n) " + grade);

    }
}
/*
Enter your grade as a percent: 97
Your grade is a(n) A
 */