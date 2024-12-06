package Q2.CL39;

public class LP39cl {
    private int year;
    private int month;
    private int day;
    private int year2;
    private int month2;
    private int day2;
    private int alive;
    private int sleep;

    public LP39cl(int y, int m, int d, int y2, int m2, int d2) {
        year = y;
        month = m;
        day = d;
        year2 = y2;
        month2 = m2;
        day2 = d2;
        alive = 0;
        sleep = 0;
    }
    public void calc() {
        alive = Math.abs((year2 - year)*365) + Math.abs((month2 - month)*30) - Math.abs((day2 - day));
        sleep = Math.abs(alive*8);
    }

    public String toString() {
        return "You have been alive for " + alive + " days!" + "\n"
                + "You have slept " + sleep + " hours!";
    }

}

