package Q2.ArrayList;

public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity = myCapacity * 2; //myCapacity *= 2
    }

    private void halfCapacity() {
        myCapacity /= 2;
    }

    private void add(int num) {
        if (mySize + 1 == myCapacity);

    }

    public void remove(int index) {

    }

    public int get(int index) {

    }

    public void set(int index, int num) {

    }

    public int size() {

    }

    public int[] toArray() {

    }

    public int IndexOf(int num) {

    }

}
