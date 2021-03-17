package _b7_Abstract_class_Interface.thuc_hanh.animal_interface_edible;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
