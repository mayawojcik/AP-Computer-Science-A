package Q3;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Prog901a {
    public static void printFile(Scanner sydney) {
        String s = "";
        while (sydney.hasNext()) {
            s += sydney.nextLine() + "\n";
        }
        System.out.println(rString(s));
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
/*
lufituaeb dna dalg sgnihT
lla dna efil gninrom dooG
klis ro ocilac ti eB
klim sa etihw sa htolc nI
erar os wohs a ekam tahT
riaf nemow uoy ot liaH
srewolf fo sdleif neerg uoy dnA
srewob ydahs uoy ot liaH
seton yb sevael rebmun dluoW
staorht esohw sdrib uoy ot liaH
hgih erusaem sduolc thgirb hcihW
yks gninrom eht ot liaH
dne on sah gnidneps siH
dneirf taerg ym si nus ehT
dlog eht snwo taht eh tuB
dloh gnihton stekcop yM
lufituaeb dna dalg sgnihT
lla dna efil gninrom dooG
 */