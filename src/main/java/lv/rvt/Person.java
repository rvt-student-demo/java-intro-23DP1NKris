package lv.rvt;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    private String address;

    public Person(String name, String adress) {
        this(name, 0, 0, 0, adress);
        
    }

    public Person(String name, int age, int weight, int height, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getAdress() {
        return this.address;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return name + "\n   " + address;
    }

    public String toCsvRow() {
        return name + ", " + age + ", " + height + ", " + weight;
    }


}
