package lv.rvt;

public class Timer {
    private int seconds;
    private int hundredths;

    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    public void advance() {
        hundredths++;
        if (hundredths == 100) {
            hundredths = 0;
            seconds++;
        }
        if (seconds == 60) {
            seconds = 0;
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
}
