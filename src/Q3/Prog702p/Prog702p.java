package Q3.Prog702p;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));
            List<Animals> list = new ArrayList<>();
            int num = input.nextInt();

            while (num != 99) {
                String first = input.next();
                String last = input.next();
                String name = first + " " + last;
                if (num == 1) {
                    double furWorth = input.nextDouble();
                    Animals a = new Hiccas(name, furWorth);
                    list.add(a);
                } else if (num == 2) {
                    double steps = input.nextInt();
                    Animals a = new Wallies(name, steps);
                    list.add(a);
                } else if (num == 3) {
                    String size = input.next();
                    Animals a = new Beepers(name, size);
                    list.add(a);
                }
                num = input.nextInt();
            }

            int hiccaCount = 0;
            double tFurWorth = 0;
            int wallieCount = 0;
            double tSteps = 0;
            int beepCount = 0;
            double tWordSize = 0;
            String BeepWords = "";

            for (Animals a : list) {
                if (a instanceof Hiccas) {
                    hiccaCount++;
                    tFurWorth += ((Hiccas)a).getFurWorth();
                } else if (a instanceof Wallies) {
                    wallieCount++;
                    tSteps += ((Wallies)a).getSteps();
                } else if (a instanceof Beepers) {
                    beepCount++;
                    tWordSize += ((Beepers)a).getWordSize().length();
                    BeepWords += ((Beepers)a).getWordSize();
                }
            }

            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int[] letterCount = new int[26];
            for (int lcv = 0; lcv < BeepWords.length(); lcv++) {
                String letter = BeepWords.substring(lcv, lcv+1);
                for (int lcv2 = 0; lcv2 < alphabet.length(); lcv2++)
                    if (letter.equals(alphabet.substring(lcv2, lcv2+1))) letterCount[lcv2]++;
            }

            int max = letterCount[0];
            String maxL = "a";
            int secondMax = 0;
            String secMaxL = "";
            for (int lcv = 1; lcv < letterCount.length; lcv++) {
                if (letterCount[lcv] > max) {
                    max = letterCount[lcv];
                    maxL = alphabet.substring(lcv, lcv + 1);
                }
                else if (letterCount[lcv] == max) {
                    secondMax = letterCount[lcv];
                    secMaxL = alphabet.substring(lcv, lcv + 1);
                }
            }

            System.out.printf("The average value of the Hicca fur is $%.2f\n",
                    tFurWorth/hiccaCount);
            System.out.printf("The average number of steps taken by the Wallies is %.2f steps\n",
                    tSteps/wallieCount);
            System.out.printf("The average size of the Beepers' words is %.2f letters\n\n",
                    tWordSize/beepCount);

            System.out.println("EXTRA CREDIT:");
            if (secondMax != 0) System.out.println("The most common letter(s) in all the Beepers' words is "
                    + maxL + ", " + secMaxL);
            else System.out.println("The most common letter(s) in all the Beepers' words is "
                    + maxL);
            System.out.println();

            for (Animals a : list) {
                if (a instanceof Hiccas) {
                    System.out.println("The Hicca's name is " + a.getName());
                    System.out.printf("Its fur is worth $%.2f\n\n",
                            ((Hiccas)a).getFurWorth());
                } else if (a instanceof Wallies) {
                    System.out.println("The Wallie's name is " + a.getName());
                    System.out.printf("Wallie has taken %.2f steps\n\n",
                            (double)((Wallies)a).getSteps());
                } else if (a instanceof Beepers) {
                    System.out.println("The Beeper's name is " + a.getName());
                    System.out.printf("Beepers word is %s\n\n",
                            ((Beepers)a).getWordSize());
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    /*
    The average value of the Hicca fur is $3.06
The average number of steps taken by the Wallies is 63.20 steps
The average size of the Beepers' words is 7.25 letters

EXTRA CREDIT:
The most common letter(s) in all the Beepers' words is a, e

The Hicca's name is Billy Buckner
Its fur is worth $3.25

The Wallie's name is Fred Ballony
Wallie has taken 28.00 steps

The Beeper's name is Nick Cuccia
Beepers word is coolbeans

The Hicca's name is Murray Cox
Its fur is worth $4.00

The Hicca's name is Carly Seifert
Its fur is worth $2.58

The Hicca's name is Elias Smith
Its fur is worth $3.22

The Wallie's name is Katy Rumberger
Wallie has taken 45.00 steps

The Wallie's name is Tanya Barton
Wallie has taken 78.00 steps

The Wallie's name is Casey Bats
Wallie has taken 97.00 steps

The Wallie's name is Brandon Davis
Wallie has taken 68.00 steps

The Beeper's name is Ingrid Sink
Beepers word is superdude

The Beeper's name is Nico Binge
Beepers word is attaway

The Beeper's name is Mike Break
Beepers word is done

The Hicca's name is Brad Williamson
Its fur is worth $2.75

The Hicca's name is Lorenzo Rapp
Its fur is worth $2.55
     */
}