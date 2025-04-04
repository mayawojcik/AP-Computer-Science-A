package Q3;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Prog901a {
    public static void printFile(Scanner sydney) {
        String s = "";
        while (sydney.hasNext()) {
            s += sydney.nextLine() + "\n";
        }
        System.out.println(reverseString(s));
    }

    public static String rString(String s) {
        if (s.length() == 0) return "";
        return rString(s.substring(1)) + s.substring(0,1);
    }

    public static void main(String[] args) {
        try {
            Scanner sydney = new Scanner(new File("Langdat/prog512h.dat"));
            printFile(sydney);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
