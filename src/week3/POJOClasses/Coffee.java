package week3.POJOClasses;

public class Coffee {
    private int brewStrength;
    private boolean sugar;
    private String milkType;
    private double cost;


    public Coffee(int brewStrength, boolean sugar, String milkType, double cost) {
        this.brewStrength = brewStrength;
        this.sugar = sugar;
        this.milkType = milkType;
        this.cost = cost;


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


}
