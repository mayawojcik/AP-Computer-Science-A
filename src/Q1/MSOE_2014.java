package Q1;
import java.util.Locale;
import java.util.Scanner;

public class MSOE_2014 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in); // kbd means keyboard
        System.out.print("Enter a word: " );
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt = 0; //dblcnt mean double count

        // -1 because theres no point checking the last letter
        for (int lcv = 0; lcv < word.length() - 1; lcv++) {
            String cLetter = word.substring(lcv, lcv+1); //word[lcv]
            String nLetter = word.substring(lcv+1, lcv+2); //word[lcv + 1]
            if (cLetter.equals(nLetter))
                dblcnt++;

        }
        System.out.printf("%s contains %d double letters\n", word, dblcnt);
    }
}
