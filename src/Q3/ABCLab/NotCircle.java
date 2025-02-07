package Q3.ABCLab;

public abstract class NotCircle implements Shape {
    protected double height;

    public double getHeight;
    public abstract void setHeight(double h);

    public void printClass() {
        System.out.println(this.getClass().getSimpleName());

    }
}
