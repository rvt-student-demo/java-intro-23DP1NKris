package lv.rvt;

public class Student {
    private int credits;

    public Student() {
        System.out.println("Hey, I'm making a new student.");
        this.credits = 0;
    }

    public void play() {
        this.credits -= 8;
    }
}
