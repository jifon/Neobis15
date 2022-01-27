package week3.POJOClasses;
import java.util.ArrayList;


public class Customer {

    private Long custumerID;
    private String name;
    private String numberOfCard;
    private String codeOfCard;
    private ArrayList<Product> orders = new ArrayList<>();

    public Customer(Long custumerID, String name, String numberOfCard, String codeOfCard, ArrayList<Product> orders) {
        this.custumerID = custumerID;
        this.name = name;
        this.numberOfCard = numberOfCard;
        this.codeOfCard = codeOfCard;
        this.orders = orders;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(String numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public String getCodeOfCard() {
        return codeOfCard;
    }

    public void setCodeOfCard(String codeOfCard) {
        this.codeOfCard = codeOfCard;
    }


}
