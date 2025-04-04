package Q3;
import java.util.Scanner;

public class MSOE2021_1 {
    public static void main(String[] args) {
        Scanner sydney = new Scanner(System.in);
        int count = 0;
        System.out.println("GIVE ME A LETTER!!!");
        String letter = sydney.nextLine();
        System.out.println("NOW GIVE ME A SENTENCE GRRRRRR!!!");
        String sentence = sydney.nextLine();
        for (int o = 0; o < sentence.length()-1; o++) {
            if (sentence.substring(o, o+1).equals(" ")) {
                if (sentence.substring(o-1, o).equals(letter)) {
                    for (int p = o-1; p > 0; p--) {
                        if (sentence.substring(p, p + 1).equals(" ")) {
                            System.out.println("WORD IS " + sentence.substring(p + 1, o));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("THERE IS NOT A WORD ENDING WITH " + letter + "!");
    }

}
/*
GIVE ME A LETTER!!!
y
NOW GIVE ME A SENTENCE GRRRRRR!!!
Sydney is super funny and cute!
WORD IS funny
 */