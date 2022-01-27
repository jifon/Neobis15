package week3.POJOClasses;

public class Donut {

    private String glaze;
    private String filling;
    final double cost = 5.50;

    public Donut(String glaze, String filling) {
        this.glaze = glaze;
        this.filling = filling;
    }

    public String getGlaze() {
        return glaze;
    }

    public void setGlaze(String glaze) {
        this.glaze = glaze;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public double getCost() {
        return cost;
    }

}
