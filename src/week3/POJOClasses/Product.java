package week3.POJOClasses;

public class Product {

    private Long productID;
    private String name;
    private Double cost;
    private String dateOfManifacture;
    private String  expiryDate;



    public Product(Long productID, String name, String dateOfManifacture, String expiryDate) {
        this.productID = productID;
        this.name = name;
        this.dateOfManifacture = dateOfManifacture;
        this.expiryDate = expiryDate;
    }

    public Product() {
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDateOfManifacture() {
        return dateOfManifacture;
    }

    public void setDateOfManifacture(String dateOfManifacture) {
        this.dateOfManifacture = dateOfManifacture;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
