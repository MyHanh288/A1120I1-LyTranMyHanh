package _b11_map_tree.bai_tap.ArrayList_LinkedList;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int value;

    public Product() {
    }

    public Product(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", value=" + value + '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
