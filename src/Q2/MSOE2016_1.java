package Q2;
import java.util.*;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lowercase word!!!!!!: ");
        String word = input.nextLine().toLowerCase().trim();

        boolean palindrome = true;
        for(int lcv = 0; lcv < word.length()/2; ++lcv)
            if(word.charAt(lcv) == word.charAt(word.length() - (lcv+1)));
        System.out.printf("This is %sa palindrome!!!!\n", "");






    }
}
/*
Enter a lowercase word!!!!!!:
abba
This is a palindrome!!!!
 */