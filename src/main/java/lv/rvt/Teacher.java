package lv.rvt;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int grade() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   salary " + salary + " euro/month";
    }
}

