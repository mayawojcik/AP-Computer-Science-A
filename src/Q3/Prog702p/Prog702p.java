package Q3.Prog702p;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
         try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));

            List<Animal> list = new ArrayList<>();

            int num = input.nextInt();

            while (num != 99) {
                String f = input.next();
                String l = input.next();
                String name = f + " " + l;

                if (num == 1) {
                    double money = input.nextDouble();
                    Animal a = new Hicca(name, money);
                    list.add(a);
                } else if (num == 2) {
                    int steps = input.nextInt();
                    Animal a = new Wallie(name, steps);
                    list.add(a);
                } else if (num == 3) {
                    String spWord = input.next();
                    Animal a = new Beeper(name, spWord);
                    list.add(a);
                }
                num = input.nextInt();
            }

            int hCnt = 0;
            double totFurCost = 0;
            int wCnt = 0;
            double totSteps = 0;
            int bCnt = 0;
            double totWordSize = 0;
            String allBWords = "";

            for (Animal a : list) {
                if (a instanceof Hicca) {
                    hCnt++;
                    totFurCost += ((Hicca)a).getMoney();
                } else if (a instanceof Wallie) {
                    wCnt++;
                    totSteps += ((Wallie)a).getSteps();
                } else if (a instanceof Beeper) {
                    bCnt++;
                    totWordSize += ((Beeper)a).getSpWord().length();
                    allBWords += ((Beeper)a).getSpWord();
                }
            }

            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int[] letterCnt = new int[26];
            for (int lcv = 0; lcv < allBWords.length(); lcv++) {
                String letter = allBWords.substring(lcv, lcv+1);
                for (int lcv2 = 0; lcv2 < alphabet.length(); lcv2++)
                    if (letter.equals(alphabet.substring(lcv2, lcv2+1))) letterCnt[lcv2]++;
            }

            int max = letterCnt[0];
            String maxL = "a";
            int secondMax = 0;
            String secMaxL = "";
            for (int lcv = 1; lcv < letterCnt.length; lcv++) {
                if (letterCnt[lcv] > max) {
                    max = letterCnt[lcv];
                    maxL = alphabet.substring(lcv, lcv + 1);
                }
                else if (letterCnt[lcv] == max) {
                    secondMax = letterCnt[lcv];
                    secMaxL = alphabet.substring(lcv, lcv + 1);
                }
            }

            System.out.printf("The average value of the Hicca fur is: $%.2f\n", totFurCost/hCnt);
            System.out.printf("The average number of steps taken by the Wallies is: %.2f steps\n", totSteps/wCnt);
            System.out.printf("The average size of the Beepers' words is: %.2f letters\n\n", totWordSize/bCnt);

            System.out.println("EXTRA CREDIT:");
            if (secondMax != 0) System.out.println("The most common letter(s) in all the Beepers' words is: " + maxL + ", " + secMaxL);
            else System.out.println("The most common letter(s) in all the Beepers' words is: " + maxL);
            System.out.println();

            for (Animal a : list) {
                if (a instanceof Hicca) {
                    System.out.println("Hicca's name is: " + a.getName());
                    System.out.printf("Its fur is worth: $%.2f\n\n",((Hicca)a).getMoney());
                } else if (a instanceof Wallie) {
                    System.out.println("Wallie's name is: " + a.getName());
                    System.out.printf("Wallie has taken: %.2f steps\n\n",(double)((Wallie)a).getSteps());
                } else if (a instanceof Beeper) {
                    System.out.println("Beeper's name is: " + a.getName());
                    System.out.printf("Beepers word is: %s\n\n", ((Beeper)a).getSpWord());
                }
            }
        } catch (IOException e) {
            System.out.println("error: " + e");
        }
    }
}
