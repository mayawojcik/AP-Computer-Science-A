package Q2;
import java.util.Scanner;

public class MSOE2016_1 {
    public static boolean isPalindrome(String str){
        String wrd = "";
        boolean answer = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            wrd = wrd + str.charAt(i);
        }
        if (str.equals(wrd)) {
            answer = true;
        }
        return answer;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lowercase word!!!!");
        String str = input.nextLine().toLowerCase();
        boolean word = isPalindrome(str);
        System.out.println(word);
            }

    }
/*
Enter a lowercase word!!!!
abba
true
 */
