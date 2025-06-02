package Q4.Prog7301m;
import java.io.Serializable;

public class Layer implements Serializable {
    static class Neuron implements Serializable {
        public double[] Weights;
        public double Bias;
        public double Value; // a_i(^l)
        public double Delta;

        public Neuron(int prevLayerSize) {
            Weights = new double[prevLayerSize];
            Bias = Math.random() - 0.5;
        }
    }
}
