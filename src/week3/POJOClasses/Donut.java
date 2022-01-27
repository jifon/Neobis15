package week3.POJOClasses;

public class Donut extends Dessert {

    private Glaze glaze;

    public Donut(Long productID, String name, String dateOfManifacture, String expiryDate, Filling filling, Powder powder, Sweeteners sweeteners, Glaze glaze) {
        super(productID, name, dateOfManifacture, expiryDate, filling, powder, sweeteners);
        this.glaze = glaze;
    }

    public Donut(Glaze glaze) {
        this.glaze = glaze;
    }

    public Donut() {
    }

    public Glaze getGlaze() {
        return glaze;
    }

    public void setGlaze(Glaze glaze) {
        this.glaze = glaze;
    }
}
