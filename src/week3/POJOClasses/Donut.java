package week3.POJOClasses;

public class Donut extends Product {

    private String glaze;
    private String filling;
    private String powder;

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


}
