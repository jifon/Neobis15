package week3.POJOClasses;


public class Coffee extends Product{

    private CoffeeSize coffeeSize;
    private Integer brewStrength;
    private MilkType milkType;
    private Sweeteners sweeteners;


    public Coffee(Long productID, String name, String dateOfManifacture, String expiryDate, CoffeeSize coffeeSize, Integer brewStrength, MilkType milkType,  Sweeteners sweeteners) {
        super(productID, name, dateOfManifacture, expiryDate);
        this.coffeeSize = coffeeSize;
        this.brewStrength = brewStrength;
        this.milkType = milkType;
        this.sweeteners = sweeteners;
    }

    public Coffee(CoffeeSize coffeeSize, Integer brewStrength, MilkType milkType,  Sweeteners sweeteners) {
        this.coffeeSize = coffeeSize;
        this.brewStrength = brewStrength;
        this.milkType = milkType;
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

    public Sweeteners getSweeteners() {
        return sweeteners;
    }

    public void setSweeteners(Sweeteners sweeteners) {
        this.sweeteners = sweeteners;
    }
}


