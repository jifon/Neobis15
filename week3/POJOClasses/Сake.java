package week3.POJOClasses;

public class Сake extends Product{

    private Filling filling;
    private Powder powder;
    private Sweeteners sweeteners;
    private Cream cream;

    public Сake(Long productID, String name, String dateOfManifacture, String expiryDate, Filling filling, Powder powder, Sweeteners sweeteners, Cream cream) {
        super(productID, name, dateOfManifacture, expiryDate);
        this.filling = filling;
        this.powder = powder;
        this.sweeteners = sweeteners;
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
