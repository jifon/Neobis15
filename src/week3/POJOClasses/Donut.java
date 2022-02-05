package week3.POJOClasses;

public class Donut extends Product{

    private Glaze glaze;
    private Filling filling;
    private Powder powder;
    private Sweeteners sweeteners;


    public Donut(Long productID, String name, String dateOfManifacture, String expiryDate, Glaze glaze, Filling filling, Powder powder, Sweeteners sweeteners) {
        super(productID, name, dateOfManifacture, expiryDate);
        this.glaze = glaze;
        this.filling = filling;
        this.powder = powder;
        this.sweeteners = sweeteners;
    }

    public Donut() {
    }


    public Glaze getGlaze() {
        return glaze;
    }

    public void setGlaze(Glaze glaze) {
        this.glaze = glaze;
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
