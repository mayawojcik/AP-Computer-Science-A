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
        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.substring(i, i+1).equals(" ")) {
                if (sentence.substring(i-1, i).equals(letter)) {
                    for (int j = i-1; j > 0; j--) {
                        if (sentence.substring(j, j + 1).equals(" ")) {
                            System.out.println("The word is: " + sentence.substring(j + 1, i));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("There isn't a word ending in " + letter + "!");
    }

    }
