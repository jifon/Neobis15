package week3.POJOClasses;
import java.util.ArrayList;
import java.util.Scanner;


public class Customer {
    Scanner scann = new Scanner(System.in);

    private String name;
    private int numberOfCard;
    private String codeOfCard;
    private ArrayList<Object> basket = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addNewOder(){
        System.out.println("for ordering coffee - 1 , donuts -2");
        String num = scann.nextLine();
        switch (num) {
            case "1":
                basket.add(addCoffee());
                break;
            case "2":
                basket.add(addDonut());
                break;
            default:
                System.out.println("you entered the wrong value.");
                break;
        }
    }

    public void removeOrder(){
        int index = 0;
        for(Object o : basket){
            System.out.println(index);
            index += 1;
            System.out.println(o.toString());
        }

        System.out.println("enter index of product");
        int x = scann.nextInt();
        basket.remove(x);
    }

    public void pay(){
        double totalCost = 0;

        for(Object o : basket){
            System.out.println(o.toString());
            if(o instanceof Donut){
                totalCost += ((Donut) o).getCost();
            }
            else if(o instanceof Coffee){
                totalCost += ((Coffee) o).getCost();
            }
        }

        System.out.println(totalCost);

    }

    public Coffee addCoffee(){
        System.out.println(" Select coffee strength from 1 to 5:");
        int brewStrength = scann.nextInt();
        System.out.println(" With sugar-1, without sugar-0");
        int x = scann.nextInt();
        boolean sugar = x == 1? true: false;
        System.out.println(" With cow milk - cow, coconut milk - coconut, without milk - without");
        String milk = scann.nextLine();

        Coffee coffee = new Coffee(brewStrength,sugar,milk);
        return coffee;
    }
    public Donut addDonut(){
        System.out.println("enter type of glaze");
        String glaze = scann.nextLine();
        System.out.println("enter filling");
        String filling = scann.nextLine();

        Donut donut = new Donut(glaze, filling);
        return donut;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public String getCodeOfCard() {
        return codeOfCard;
    }

    public void setCodeOfCard(String codeOfCard) {
        this.codeOfCard = codeOfCard;
    }

    public ArrayList<Object> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Object> basket) {
        this.basket = basket;
    }
}
