package lv.rvt;

public class CD implements Packable {
    public String artist;
    public String name;
    public int year;
    public double weight;

    public CD (String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return artist+": "+name+" ("+year+")";
    }

    @Override
        public double weight() {
            return 0.1;
        }
}
