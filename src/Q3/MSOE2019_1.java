package Q3;
import java.util.Scanner;

public class MSOE2019_1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sydney = new Scanner(System.in);
        System.out.println("Enter two letters:" );
        String letters = sydney.nextLine();
        System.out.println("Enter a line of text: ");
        String line = sydney.nextLine();
        for (int y = 0; y < letters.length(); y++) {
            if (letters.substring(y, y+1).equals(line.substring(0, 1))) {
                if (line.substring(y+1, y+2).equals(letters.substring(1)) || line.substring(y-1, y).equals(letters.substring(1))) {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("THESE LETTERS ARE SEEN " + count + " TIMES!");
    }
}
/*
Enter two letters:
 ei
Enter a line of text:
can marlon jump?

THESE LETTERS ARE SEEN 0 TIMES!
 */