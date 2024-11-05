package lv.rvt;

public class Agent {
    private String name1;
    private String name2;

    public Agent(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String toString() {
        return name1 + " " + name2;
    }

    public void printAgent() {
        System.out.println(this.toString());
    }
}