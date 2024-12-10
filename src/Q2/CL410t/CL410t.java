package Q2.CL410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CL410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("survey2.dat, survey.dat"));

            System.out.println("ID\tIncome\tMembers");
            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

