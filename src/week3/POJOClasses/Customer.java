package week3.POJOClasses;
import java.util.ArrayList;


public class Customer {

    private String name;
    private int numberOfCard;
    private String codeOfCard;
    private ArrayList<Object> basket = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
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
