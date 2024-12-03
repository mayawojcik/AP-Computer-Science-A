package Q2.LP314cl;

public class LP314cl {
    private int AwNy;
    private int MaNy;
    private int AwNj;
    private int MaNj;
    private int AwC;
    private int MaC;
    private double totA;
    private double totM;
    private int Aw;
    private int Ma;
    private int total;

    public LP314cl(int AwNy, int MaNy, int AwNj, int MaNj, int AwC, int MaC) {
        this.AwNy = AwNy;
        this.MaNy = MaNy;
        this.AwNj = AwNj;
        this.MaNj = MaNj;
        this.AwC = AwC;
        this.MaC = MaC;
        totA = 0;
        totM = 0;
        Aw = 0;
        Ma = 0;
        total = 0;

    }
    public void calc() {
        Aw = this.AwNy + this.AwNj + this.AwC;
        Ma = this.MaNy + this.MaNj + this.MaC;
        total = Aw + Ma;
        totA = (Aw / total)*100;
        totM = (Ma / total)*100;
    }
    public String toString() {
        return "Election results for New York:\n" + "Awbrey: " + this.AwNy + "\n"
                + "Martinez: " + this.MaNy + "\n\n" +
                "Election results for New Jersey:\n" + "Awbrey: " + this.AwNj + "\n"
                + "Martinez: " + this.MaNj + "\n\n" +
                "Election results for Connecticut:\n" + "Awvrey: " + this.AwC + "\n"
                + "Martinez: " + this.MaC + "\n\n" +
                "Candidate              " + "Votes   " + "Percentage\n" +
                "Awbrey                 " + Aw + "   " + totA + "\n" +
                "Martinez               " + Ma + "   " + totM + "\n" +
                "TOTAL VOTES:           " + total;
    }
}
