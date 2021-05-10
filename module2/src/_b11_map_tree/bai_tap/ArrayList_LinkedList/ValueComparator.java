package _b11_map_tree.bai_tap.ArrayList_LinkedList;

import java.util.Comparator;

public class ValueComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getValue()-o1.getValue();
    }
}
