package Q2.Prog435a;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435a.dat"));
            int[] type = new int[100];
            int[] gate = new int[100];
            String[] fact = new String[100];
            double[] ty = new double[100];
            double[] total = new double[100];
            double[] price = new double[100];
            int count = 0;

            while (file.hasNext()) {
                type[count] = file.nextInt();
                gate[count] = file.nextInt();
                count++;
            }

            Cl435a thing = new Cl435a(fact, ty, total, price, type, gate);
            thing.calc();
            fact = thing.getFact();
            ty = thing.getTy();
            total = thing.getTotal();
            price = thing.getPrice();
            type = thing.getType();
            gate = thing.getGate();
            thing.toString();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Car Type		Base Toll		Factor		Cost
Compact Car		1.35			1.00		1.35
Small Car		2.50			1.30		3.25
Mid Size Car	4.10			1.60		6.56
Full size Car	5.50			2.00		11.00
Truck			2.00			2.40		4.80
16 Wheeler		3.25			2.70		8.78
Compact Car		4.80			1.00		4.80
Small Car		6.00			1.30		7.80
Mid Size Car	1.35			1.60		2.16
Full size Car	2.50			2.00		5.00
Truck			4.10			2.40		9.84
16 Wheeler		5.50			2.70		14.85
Compact Car		6.00			1.00		6.00
Small Car		1.35			1.30		1.76
Mid Size Car	2.00			1.60		3.20
Full size Car	2.50			2.00		5.00
Truck			3.25			2.40		7.80
16 Wheeler		4.10			2.70		11.07

Process finished with exit code 0
 */