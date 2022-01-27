package week3.POJOClasses;

public class Сake extends Dessert{

    private Cream cream;

    public Сake(Long productID, String name, String dateOfManifacture, String expiryDate, Filling filling, Powder powder, Sweeteners sweeteners, Cream cream) {
        super(productID, name, dateOfManifacture, expiryDate, filling, powder, sweeteners);
        this.cream = cream;
    }

    public Сake(Cream cream) {
        this.cream = cream;
    }

    public Сake() {
    }

    public void setCream(Cream cream) {
        this.cream = cream;
    }

    public Cream getCream() {
        return cream;
    }
}
