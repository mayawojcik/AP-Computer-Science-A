package Q2.LP310;
import java.util.*;

public class LP310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of burgers: ");
        int burger = input.nextInt();
        System.out.println("Enter the amount of fries: ");
        int fries = input.nextInt();
        System.out.println("Enter the amount of soda: ");
        int soda = input.nextInt();
        System.out.println("Enter the amount tendered: ");
        double tendered = input.nextDouble();

        LP310cl cat = new LP310cl(burger, fries, soda, tendered);
        cat.calc();

        System.out.println(cat);


    }

}
/*
Enter the amount of burgers:
2
Enter the amount of fries:
5
Enter the amount of soda:
5
Enter the amount tendered:
20
Amount of burgers: 2
Amount of fries: 5
Amount of soda: 5
Total before tax: $13.78
Tax: $0.9
Final total: $14.68
Amount tendered: $20.0
Change: $5.32
 */