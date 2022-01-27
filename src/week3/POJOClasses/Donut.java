package week3.POJOClasses;

public class Donut {

    private String glaze;
    private String filling;
    private double cost ;

    public Donut(String glaze, String filling, double cost) {
        this.glaze = glaze;
        this.filling = filling;
        this.cost = cost;
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

    public void setCost(double cost) {
        this.cost = cost;
    }
}
