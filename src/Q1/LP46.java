package Q1;
import java.util.*;

public class LP46 {
    public static void doStuff(int sign, int num1, double num2) {
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        if (sign == 1) {
            System.out.println("What is " + num1 + "+" + num2);
            userInput = input.nextDouble();
            if (userInput == num1 + num2) {
                System.out.println("YAY! You got it!");
            } else {
                System.out.println("Oh no! That's not it!");
            }
        } else if (sign == 2) {
            System.out.println("What is " + num1 + "-" + num2);
            userInput = input.nextDouble();
            if (userInput == num1 - num2) {
                System.out.println("YAY! You got it!");
            } else {
                System.out.println("Oh no! That's not it!");
            }
        }else if (sign == 3) {
            System.out.println("What is " + num1 + "*" + num2);
            userInput = input.nextDouble();
            if (userInput == num1 * num2) {
                System.out.println("YAY! You got it!");
            } else {
                System.out.println("Oh no! That's not it!");

            }
        }else if (sign == 4) {
            System.out.println("What is " + num1 + "/" + num2);
                userInput = input.nextDouble();
                if (userInput == num1 / num2) {
                    System.out.println("YAY! You got it!");
                } else {
                    System.out.println("Oh no! That's not it!");
                }
            }
        }

        public static void main(String[] args) {
            int userInput = 0;
            int sign = ((int)(Math.random() * 4) + 1);
            int num1 = ((int)(Math.random() * 10) + 1);
            double num2 = ((int)(Math.random()*10)+1);

            doStuff(sign,num1,num2);
        }
    }
/*
What is 5+5.0
10
YAY! You got it!

or!!

What is 8-8.0
54
Oh no! That's not it!
 */
