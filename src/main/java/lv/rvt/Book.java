    package lv.rvt;

    public class Book implements Packable{
        public String author;
        public String name;
        public double weight;

        public Book(String author, String name, double weight) {
            this.author = author;
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return author+": "+name;
        }

        @Override
        public double weight() {
            return this.weight;
        }
    }
