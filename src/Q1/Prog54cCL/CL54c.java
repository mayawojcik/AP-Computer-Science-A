package Q1.Prog54cCL;

public class CL54c {
    private double radius;
    private double area;
    private double circumference;
    private double arear;
    private double circumferencer;

    public CL54c(double radius) {
        this.radius = radius;
        area = 0;
        circumference = 0;
        arear = 0;
        circumferencer = 0;
    }

    public void calc(){
        circumference = 2 * (3.14159 * this.radius);
        circumferencer = Math.round(circumference * 100.0) / 100.0;
        area = 3.14159 * ((int)Math.pow(this.radius, 2));
        arear = Math.round(area * 100.0) / 100.0;
    }

    public String toString() {
        return "The area is: " + arear + "\n"
                + "The circumference is: " + circumferencer;
    }
}
