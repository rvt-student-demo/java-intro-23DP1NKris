package lv.rvt;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void play() {
        this.credits -= 8;
    }

    public int credits() {
        return this.credits;
    }

    public int study() {
        return credits += 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   Study credits " + credits;
    }
}
