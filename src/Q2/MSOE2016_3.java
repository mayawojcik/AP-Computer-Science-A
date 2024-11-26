package Q2;
import java.util.*;

public class MSOE2016_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("What's the refractive index? ");
       double n = input.nextDouble();
       System.out.println("What's the first radius? ");
       double R1 = input.nextDouble();
       System.out.println("What's the second radius? ");
       double R2 = input.nextDouble();
       System.out.println("What's the thickness? ");
       double d = input.nextDouble();
        final double f = 1. / ((n-1)*(1./R1-1./R2+((n-1)*d)/(n*R1*R2)));
        System.out.printf("The focal length is %g!!\n", f);
    }
}
/*
What's the refractive index?
12
What's the first radius?
6.7
What's the second radius?
43
What's the thickness?
32
The focal length is 0.399049!!
 */