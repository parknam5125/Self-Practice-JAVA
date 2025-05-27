public class Fruit implements Comparable {
    private String fruitName;

    public Fruit() {
        fruitName = "";
    }

    public Fruit(String name) {
        fruitName = name;
    }

    public void setName(String name) {
        fruitName = name;
    }

    public String getName() {
        return fruitName;
    }

    public int compareTo(Object obj) {
        Fruit other = (Fruit)obj;
        return this.fruitName.compareTo(other.fruitName);
    }

    public String toString() {
        return fruitName;
    }
}
