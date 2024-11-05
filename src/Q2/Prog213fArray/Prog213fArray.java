package Q2.Prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213f.dat"));

            CL213f[] list = new CL213f[1000];
            int cnt = 0;

            while (file.hasNext()) {
                int kwh = file.nextInt();

                if (kwh != -999) {
                    CL213f yikes = new CL213f(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }
            }

            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].calc();
                System.out.println(list[lcv]); // or list[lcv].toString()
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
