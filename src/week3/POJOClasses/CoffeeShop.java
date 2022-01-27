package week3.POJOClasses;

import java.util.Scanner;

public class CoffeeShop {
    Scanner scann = new Scanner(System.in);
    private String name;
    private String Address;
    private int phoneNumber;

    public void startWork() {
        System.out.println(" Welcome to our coffee shop! We will prepare for you any coffee with any donuts according to your preference.Here you can order your coffee in advance and not wait! ");
        newCustomer();

    }

    private void newCustomer() {
        System.out.println("Name: ");
        String nameOfCustomer = scann.nextLine();
        Customer customer = new Customer(nameOfCustomer);
        getOption(customer);
    }

    private void getOption(Customer customer) {
        boolean op = true;
        while (op) {
            System.out.println("1- Menu");
            System.out.println("2- Make an order");
            System.out.println("3- Remove order");
            System.out.println("4- Pay");
            System.out.println("5- Exit");
            System.out.println("**************************************");
            System.out.print("Enter the number >>> ");
            int num = scann.nextInt();
            switch (num) {
                case 1:
                    getMenu();
                    break;
                case 2:
                    customer.addNewOder();
                    break;
                case 3:
                    customer.removeOrder();
                    break;
                case 4:
                    customer.pay();
                    op = false;
                    break;
                case 5:
                    op = false;
                    break;
                default:
                    System.out.println("Wrong input! You can enter only number between 1 and 5.");
                    break;
            }
        }
    }
    public void getMenu(){
        System.out.println("------Menu------");
    }

}