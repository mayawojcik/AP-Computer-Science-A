package Q1.Prog93Cl;
import java.util.Scanner;

public class prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter kwh: ");
        int kwh = input.nextInt();

        //calc section
        Cl93a thing = new Cl93a(kwh);
        thing.calc();

        System.out.println(thing);


        // TODO: use scanner for input; remove code below
        //Cl93a thing = new Cl93a(kwh: 993);
        //System.out.println(thing); // or `thing.toString()`
    }
}
/*
Enter kwh: 993
KWH Used: 993
Base Rate: 47.17
Surcharge: 4.72
City Tax: 1.42
Total: 53.31
lateTotal: 55.44
 */