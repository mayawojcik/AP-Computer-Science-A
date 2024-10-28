package Q1.Prog82aCL;
import java.util.Scanner;

public class Prog82aCL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit: ");
        int speedLimit = input.nextInt();
        System.out.println("Enter the vehicle speed: ");
        int vehicleSpeed = input.nextInt();

        CL82a car = new CL82a(speedLimit, vehicleSpeed);
        car.calc();

        System.out.println(car);


    }
}
/*
Enter the speed limit:
30
Enter the vehicle speed:
20
Fine-----------------30
 */