package Q1;
import java.util.Scanner;
import java.util.*;

public class LP517 {
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
        String output = "";
        if (password.equals (passwordgen(10))) output = "The password you typed is incorrect";

        System.out.print("Enter the password: ");
        String password1 = input.nextLine();
        String output1 = "";
        if (password1.equals (passwordgen(10))) output1 = "The password you typed is incorrect";

        System.out.print("Enter the password: ");
        String password2 = input.nextLine();
        String output2 = "";
        if (password2.equals (passwordgen(10))) output2 = "Access denied";

        System.out.println(passwordgen(10));
    }
}


