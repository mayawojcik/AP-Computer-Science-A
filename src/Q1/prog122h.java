package Q1;

public class prog122h {
    public static void main(String[] args) {
        int lcv = 0;
        while (lcv <= 19) {
            lcv += 1;
            int lcvsq = (int)Math.pow(lcv, 2);
            double lcvrt = (double)Math.pow(lcv, 0.5);
            double lcvrtr = Math.round(lcvrt * 10000.0) / 10000.0;
            double lcvcb = (double)Math.pow(lcv, (1.0/3));
            double lcvcbr = Math.round(lcvcb * 10000.0) / 10000.0;
            double lcv4h = (double)Math.pow(lcv, (1.0/4));
            double lcv4hr = Math.round(lcv4h * 10000.0) / 10000.0;
            System.out.println(lcv + "    " + lcvsq + "    " + lcvrtr + "    " + lcvcbr + "    " + lcv4hr);
        }
    }
}
