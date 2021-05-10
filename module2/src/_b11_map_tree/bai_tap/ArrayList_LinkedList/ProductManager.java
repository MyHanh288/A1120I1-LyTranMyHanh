package _b11_map_tree.bai_tap.ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    List<Product> list = new ArrayList<>();

    public ProductManager() {
    }

    public void add(Product product){
        list.add(product);
    }

    public void set(int id, Product product){
        for (int index = 0; index<list.size(); index++){
            if(list.get(index).getId()==id){
                list.set(index,product);
            }
        }
    }

    public void remove(int id){
        for (int index = 0; index<list.size(); index++){
            if(list.get(index).getId()==id){
                list.remove(index);
            }
        }
    }

    public void showProduct(){
        for (Product product : list){
            System.out.println(product);
        }
    }

    public void find(String name){
        for (int index = 0; index<list.size(); index++){
            if(name.equals(list.get(index).getName())){
                System.out.println(list.get(index));
            }
        }
    }

    public void increase() {
        Collections.sort(list);
        showProduct();
    }

    public void reduction(){
        Collections.sort(list, new ValueComparator());
        showProduct();
    }


}
