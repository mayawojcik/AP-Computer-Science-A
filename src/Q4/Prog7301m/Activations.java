package Q4.Prog7301m;
import java.io.Serializable;

public class Activations {
    interface Activation extends Serializable {
        public double activate(double value);
        public double activaeDeriv(double value);
    }
}
