package _b7_Abstract_class_Interface.thuc_hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
