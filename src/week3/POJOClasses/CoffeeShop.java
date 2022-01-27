package week3.POJOClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {

    private Integer coffeeShopID;
    private String name;
    private String address;
    private Integer colOdEmp;
    private int phoneNumber;
    private ArrayList<Product> basket;

    public CoffeeShop(Integer coffeeShopID, String name, String address, Integer colOdEmp, int phoneNumber) {
        this.coffeeShopID = coffeeShopID;
        this.name = name;
        this.address = address;
        this.colOdEmp = colOdEmp;
        this.phoneNumber = phoneNumber;
        this.basket = new ArrayList<Product>();
    }

    public CoffeeShop() {
    }

    public Integer getCoffeeShopID() {
        return coffeeShopID;
    }

    public void setCoffeeShopID(Integer coffeeShopID) {
        this.coffeeShopID = coffeeShopID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getColOdEmp() {
        return colOdEmp;
    }

    public void setColOdEmp(Integer colOdEmp) {
        this.colOdEmp = colOdEmp;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}