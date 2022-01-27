package week3.POJOClasses;



public class Coffee extends Product{

    private CoffeeSize coffeeSize;
    private Integer brewStrength;
    private MilkType milkType;
    private Double cost;
    private Sweeteners sweeteners;


    public Coffee(CoffeeSize coffeeSize, Integer brewStrength, MilkType milkType, Double cost, Sweeteners sweeteners) {
        this.coffeeSize = coffeeSize;
        this.brewStrength = brewStrength;
        this.milkType = milkType;
        this.cost = cost;
        this.sweeteners = sweeteners;
    }

    public Coffee(){};


    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public Integer getBrewStrength() {
        return brewStrength;
    }

    public void setBrewStrength(Integer brewStrength) {
        this.brewStrength = brewStrength;
    }

    public MilkType getMilkType() {
        return milkType;
    }

    public void setMilkType(MilkType milkType) {
        this.milkType = milkType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Sweeteners getSweeteners() {
        return sweeteners;
    }

    public void setSweeteners(Sweeteners sweeteners) {
        this.sweeteners = sweeteners;
    }
}


