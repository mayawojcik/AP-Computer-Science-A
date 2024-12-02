package Q2.LP314cl;

public class LP314cl {
    private int AwNy;
    private int MaNy;
    private int AwNj;
    private int MaNj;
    private int AwC;
    private int MaC
    private int Aw;
    private int Ma;
    private int total;

    public LP314cl(int AwNy, int MaNy, int AwNj, int MaNj, int AwC, int MaC) {
        AwNy = AwNy;
        MaNy = MaNy;
        AwNj = AwNj;
        MaNj = MaNj;
        AwC = AwC;
        MaC = MaC;
        Aw = 0;
        Ma = 0;
        total = 0;

    }
    public void calc() {
        Aw = AwNy + AwNj + AwC;
        Ma = MaNy + MaNj + MaC;
        total = Aw + Ma;
    }
    public String toString() {
        return "Election results for New York:\n" + "Awbrey: " + AwNy + "\n"
                + "Martinez: " + MaNy + "\n\n" +
                "Election results for New Jersey:\n" + "Awbrey: " + AwNj + "\n"
                + "Martinez: " + MaNj + "\n\n" +
                "Election results for Connecticut:\n" + "Awvrey: " + AwC + "\n"
                + "Martinez: " + MaC + "\n\n" +
                "Candidate              " + "Votes   " + "Percentage\n" +
                "Awbrey                 " + Aw + "" + "\n" +
                "Martinez               " + Ma + "" + "\n";
    }
}
