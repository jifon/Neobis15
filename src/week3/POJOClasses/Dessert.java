package week3.POJOClasses;

public class Dessert extends Product{

    private Filling filling;
    private Powder powder;
    private Sweeteners sweeteners;

    public Dessert(Long productID, String name, String dateOfManifacture, String expiryDate, Filling filling, Powder powder, Sweeteners sweeteners) {
        super(productID, name, dateOfManifacture, expiryDate);
        this.filling = filling;
        this.powder = powder;
        this.sweeteners = sweeteners;
    }

    public Dessert(Filling filling, Powder powder, Sweeteners sweeteners) {
        this.filling = filling;
        this.powder = powder;
        this.sweeteners = sweeteners;
    }

    public Dessert() {
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public Powder getPowder() {
        return powder;
    }

    public void setPowder(Powder powder) {
        this.powder = powder;
    }

    public Sweeteners getSweeteners() {
        return sweeteners;
    }

    public void setSweeteners(Sweeteners sweeteners) {
        this.sweeteners = sweeteners;
    }
}
