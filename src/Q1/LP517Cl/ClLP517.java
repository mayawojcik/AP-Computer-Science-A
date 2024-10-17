package Q1.LP517Cl;

import java.util.Scanner;
import java.util.*;

public class ClLP517 {
    public static String passwordgen(int len) {
        String pass = "";
        for (int i = 0; i < len; i++)
            pass += (char)(int)((Math.random() * 127 - 33) + 33);
        return pass;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = input.nextLine();
        if (password != passwordgen
        System.out.println(passwordgen(10));
    }
}
