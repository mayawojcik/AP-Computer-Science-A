package Q2;
import java.util.*;

import java.util.Scanner;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lowercase word!!!!!!: ");
        String word = input.nextLine().toLowerCase().trim();

        boolean pal = false;
        for(int lcv = 0; lcv < word.length(); lcv++)
            if(word.equals(word.substring(word.length()-1 - lcv)));
        pal = true;






    }
}
