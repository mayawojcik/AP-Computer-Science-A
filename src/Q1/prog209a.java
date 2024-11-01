package Q1;
import java.util.*;
import java.io.*;

public class prog209a {
    public static void main(String[] args) {
       int count1 = 0;
       int count2 = 0;
       int total = 0;
       try {
           Scanner file = new Scanner(new File( "Langdat/prog215a.dat"));

           while (file.hasNext()) {
               total++;
               int num = file.nextInt();
               if (num < 500) {
                   count1++;
               }
               else
                   count2++;
               }
           System.out.println("Total number of numbers less than 500 is " + count1);
           System.out.println("Total number of numbers greater than or equal to 500 is " + count2);
           System.out.println("Total number of numbers is " + total);
           } catch (IOException e) {
           System.out.println("Error: " + e);
       }
    }
}
/*
Total number of numbers less than 500 is 192
Total number of numbers greater than or equal to 500 is 208
Total number of numbers is 400
 */

