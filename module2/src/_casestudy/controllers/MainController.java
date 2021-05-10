package _casestudy.controllers;

import _casestudy.models.House;
import _casestudy.models.Room;
import _casestudy.models.Villa;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    IO_Services io_services = new IO_Services();

    /**
     * exception input number Integer
     * @return number
     */
    public int exceptionInputNumber() {
        int choice = 0;
        boolean flag = false;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                flag = true;
                System.out.println("You entered it incorrectly, please re-enter it");
            }
        } while (flag);
        return choice;
    }

    public void displayMainMenu() throws IOException {
        int choice = 0;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add new service");
            System.out.println("2. Show services");
            System.out.println("3. Add new customer");
            System.out.println("4. Show customer's information");
            System.out.println("5. Add new booking");
            System.out.println("6. Show employee's information");
            System.out.println("7. Exit");
            System.out.println("Enter your choice :");
            choice = exceptionInputNumber();
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
            }
        }
    }

    public void addNewServices() throws IOException {
        int choice = 0;
        while (true) {
            System.out.println("Add menu new Services :");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            choice = exceptionInputNumber();

            switch (choice) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }


    public void addNewVilla() {
        System.out.println("Name Services: ");
        String nameServices = scanner.nextLine();
        System.out.println("Used Area: ");
        int usedArea = exceptionInputNumber();
        System.out.println("Cost: ");
        int cost = exceptionInputNumber();
        System.out.println("Max Member: ");
        int maxMember = exceptionInputNumber();
        System.out.println("Rent Type: ");
        String rentType = scanner.nextLine();
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Plus Services: ");
        String plusServices = scanner.nextLine();
        System.out.println("Room Standard: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Facilities Description: ");
        String facilitiesDes = scanner.nextLine();
        System.out.println("Floors: ");
        int floors = exceptionInputNumber();
        System.out.println("Pool Area: ");
        int poolArea = exceptionInputNumber();
        Villa villa = new Villa(nameServices, usedArea, cost, maxMember, rentType, id, plusServices, roomStandard, facilitiesDes, floors, poolArea);
        io_services.writeVilla(villa);
    }

    public void addNewHouse() {
        System.out.println("Name Services: ");
        String nameServices = scanner.nextLine();
        System.out.println("Used Area: ");
        int usedArea = exceptionInputNumber();
        System.out.println("Cost: ");
        int cost = exceptionInputNumber();
        System.out.println("Max Member: ");
        int maxMember = exceptionInputNumber();
        System.out.println("Rent Type: ");
        String rentType = scanner.nextLine();
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Plus Services: ");
        String plusServices = scanner.nextLine();
        System.out.println("Room Standard: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Facilities Description: ");
        String facilitiesDes = scanner.nextLine();
        System.out.println("Floors: ");
        int floors = exceptionInputNumber();
        House house = new House(nameServices, usedArea, cost, maxMember, rentType, id, plusServices, roomStandard, facilitiesDes, floors);
        io_services.writeHouse(house);
    }

    public void addNewRoom() {
        System.out.println("Name Services: ");
        String nameServices = scanner.nextLine();
        System.out.println("Used Area: ");
        int usedArea = exceptionInputNumber();
        System.out.println("Cost: ");
        int cost = exceptionInputNumber();
        System.out.println("Max Member: ");
        int maxMember = exceptionInputNumber();
        System.out.println("Rent Type: ");
        String rentType = scanner.nextLine();
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Plus Services: ");
        String plusServices = scanner.nextLine();
        System.out.println("Free Services: ");
        String freeServices = scanner.nextLine();
        Room room = new Room(nameServices, usedArea, cost, maxMember, rentType, id, plusServices, freeServices);
        io_services.writeRoom(room);
    }

    public void showServices() throws IOException {
        int choice = 0;
        while (true) {
            System.out.println("Show your Services :");
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show all name villa not duplicate");
            System.out.println("5. Show all name house not duplicate");
            System.out.println("6. Show all name room not duplicate");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit");
            System.out.println("Enter your choice :");
            choice = exceptionInputNumber();
            switch (choice) {
                case 1:
                    System.out.println(io_services.readVilla());
                    break;
                case 2:
                    System.out.println(io_services.readHouse());
                    break;
                case 3:
                    System.out.println(io_services.readRoom());
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("The choice is false!!!");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
