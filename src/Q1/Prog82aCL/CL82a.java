package Q1.Prog82aCL;

public class CL82a {
    private int speedLimit;
    private int vehicleSpeed;
    private int fine;

    public CL82a(int speedLimit, int vehicleSpeed) {
        this.speedLimit = speedLimit;
        this.vehicleSpeed = vehicleSpeed;
        fine = 0;
    }

    public void calc() {
        fine = ((this.vehicleSpeed - this.speedLimit) * 5) + 20;
    }

    public String toString() {
        return "Fine----------------" + fine;
    }
}
