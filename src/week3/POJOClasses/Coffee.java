package week3.POJOClasses;

public class Coffee {
    private int brewStrength;
    private boolean sugar;
    private String milkType;
    private double cost;


    public Coffee(int brewStrength, boolean sugar, String milkType) {
        this.brewStrength = brewStrength;
        this.sugar = sugar;
        this.milkType = milkType;
        switch (milkType){
            case "cow":
                this.cost = (brewStrength * 50) + (sugar? 50 : 0) + 30;
            case "coconut":
                this.cost = (brewStrength * 50) + (sugar? 50 : 0) + 50;
            default:
                this.cost = (brewStrength * 50) + (sugar? 50 : 0) + 0;
        }
    }

    public Coffee(){};

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getBrewStrength() {
        return brewStrength;
    }

    public void setBrewStrength(int brewStrength) {
        this.brewStrength = brewStrength;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        String s = "Coffee {"
                + "brewStrength='" + this.brewStrength + '\''
                + "sugar='" + this.sugar + '\''
                + ", milkType=" + this.milkType
                + '}';
        return s;
    }
}
