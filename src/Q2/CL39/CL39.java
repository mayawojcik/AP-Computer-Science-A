package Q2.CL39;
import Q1.Prog93Cl.Cl93a;

import java.util.*;

public class CL39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate!!: ");
        System.out.println("Year!: ");
        int year = input.nextInt();
        System.out.println("Month!: ");
        int month = input.nextInt();
        System.out.println("Day!: ");
        int day = input.nextInt();
        System.out.println("Enter today's date!: ");
        System.out.println("Year!: ");
        int year2 = input.nextInt();
        System.out.println("Month!: ");
        int month2 = input.nextInt();
        System.out.println("Day!: ");
        int day2 = input.nextInt();

        LP39cl thing = new LP39cl(year, month, day, year2, month2, day2);
        thing.calc();

        System.out.println(thing);
    }
}
/*
Enter your birthdate!!:
Year!:
1997
Month!:
2
Day!:
12
Enter today's date!:
Year!:
2012
Month!:
8
Day!:
3
You have been alive for 5646 days!
You have slept 45168 hours!

 */