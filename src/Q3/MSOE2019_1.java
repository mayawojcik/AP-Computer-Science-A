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
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i+1).equals(tl.substring(0, 1))) {
                if (line.substring(i+1, i+2).equals(letters.substring(1)) || line.substring(i-1, i).equals(letters.substring(1))) {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("The number of times these letters are seen together is " + count + "!");
    }
}