package Q1;
import java.util.*;

public class LP410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int num = input.nextInt();
        System.out.print("Enter width: ");
        int num2 = input.nextInt();
        System.out.print("Enter height: ");
        int num3 = input.nextInt();
        int vol = num * num2 * num3;
        System.out.println("The volume is: " + vol);
        System.out.println("");

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        double d = radius * 2;
        double PI = 3.14159;
        double vol2 = (PI*(int)Math.pow(d, 3)/6);
        System.out.printf("The volume is: %.3f\n", vol2);
        System.out.println("");

        System.out.print("Enter the length of each side: ");
        int length = input.nextInt();
        int vol3 = length * length * length;
        System.out.println("The volume is: " + vol3);
    }
}
/*
Enter length: 3
Enter width: 4
Enter height: 5
The volume is: 60

Enter the radius: 3
The volume is: 113.097

Enter the length of each side: 4
The volume is: 64
 */