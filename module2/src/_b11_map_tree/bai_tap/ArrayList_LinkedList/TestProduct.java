package _b11_map_tree.bai_tap.ArrayList_LinkedList;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        Product product;
        int choice;
        int id;
        String name;
        int value;
        do{
            System.out.println("Menu: ");
            System.out.println("1.Add\n"
                    + "2.Edit\n" + "3.Delete\n" + "4.Show\n"+ "5.Find\n"
                    + "6.Increase\n" + "7.Reduction\n" + "0.Exit");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter product information :");
                    System.out.println("Product ID :");
                    id = scanner.nextInt();
                    System.out.println("Product name :");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Product value :");
                    value = scanner.nextInt();
                    product = new Product(id, name, value);
                    productManager.add(product);
                    break;
                case 2:
                    System.out.println("Edit product information :");
                    System.out.println("Product ID :");
                    id = scanner.nextInt();
                    System.out.println("Product name :");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Product value :");
                    value = scanner.nextInt();
                    product = new Product(id, name, value);
                    productManager.set(id,product);
                    break;
                case 3 :
                    System.out.println("Enter the id which you want to delete : ");
                    id = scanner.nextInt();
                    productManager.remove(id);
                    break;
                case 4 :
                    productManager.showProduct();
                    break;
                case 5 :
                    System.out.println("Enter the name which you want to find : ");
                    name = scanner.nextLine();
                    productManager.find(name);
                    break;
                case 6 :
                    productManager.increase();
                    break;
                case 7 :
                    productManager.reduction();
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("False");
            }
        }while (true);

    }
}
