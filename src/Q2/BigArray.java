package Q2;
import java.util.*;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] = ((int)(Math.random()*91 - 20) + 20); // random * (Max-min) + min

        // step 1
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // step 2
        for (int temp : array) // for every int in array
            System.out.print(temp + " ");
        System.out.println();

        // step 3
        System.out.println("The middle number is: " + array[array.length / 2]);

        // step 4
        double avg = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.println("Average of first, middle, and last numbers is: " + (avg/3));

        // step 5
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        // step 6
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest) largeIndex = i;
        }

        int tempswap = array[smallIndex]; // to swap two things
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // step 7
        int randNum = (int)(Math.random() * 10 + 1);
        array[array.length / 2] = randNum;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // step 8
        for (int i = 0; i < array.length; i++)
            array[i] += 10;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // step 9
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is: " + myThird);

        // step 10
        for (int num : array)
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        System.out.println();

        // step 11
        for (int i = 0; i < array.length; i++)
            if (array[i] % 4 == 0)
                System.out.print(array[i] + " ");
        System.out.println();

        // step 12
        boolean sixty = false;
        for (int n : array)
            if (n == 60) sixty = true;
        System.out.println("Is 60 in the list: " + sixty);

        //step 13
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++)
            if (array[lcv] != array[array.length-1 - lcv])
                same = false;
        System.out.println("Is the array palindromic: " + same);

        // step 14
        double average = 0;
        for (int x : array)
            average += x;
        average /= array.length;

        int avgCount = 0;
        for (int x : array)
            if (x > average) avgCount++;
        System.out.printf("There are %d numbers greater than the average\n", avgCount);

        // step 15
        int evens = 0;
        for (int num : array)
            if (num % 2 == 0) evens++;
        System.out.printf("There are %d even numbers\n", evens);

        // step 16
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++)
            array2[i] = array[(array.length-1) - i];
        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        // step 17
        int[] shiftArr = circularShiftRight(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();

        // step 18
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digit of all elements: " + sum);
    }
    // step 17 pt 1!
    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv - 1];
        shifted[0] = temp;
        return shifted;

    }
}
/*
38 47 27 44 82 90 59 52 73 47 44 86 52 8 68 10 12 5 88
38 47 27 44 82 90 59 52 73 47 44 86 52 8 68 10 12 5 88
The middle number is: 47
Average of first, middle, and last numbers is: 57.666666666666664
Smallest number: 5
Largest number: 90
38 47 27 44 82 5 59 52 73 47 44 86 52 8 68 10 12 90 88
38 47 27 44 82 5 59 52 73 6 44 86 52 8 68 10 12 90 88
48 57 37 54 92 15 69 62 83 16 54 96 62 18 78 20 22 100 98
The number that was ousted is: 37
57 54 54
48 92 16 96 20 100
Is 60 in the list: false
Is the array palindromic: false
There are 10 numbers greater than the average
There are 14 even numbers
98 100 22 20 78 18 62 96 54 16 83 62 69 15 92 54 5 57 48
98 48 57 5 54 92 15 69 62 83 16 54 96 62 18 78 20 22 100
Sum of all digit of all elements: 176
 */