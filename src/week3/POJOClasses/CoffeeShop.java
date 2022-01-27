package week3.POJOClasses;

import java.util.Scanner;

public class CoffeeShop {

    private Integer coffeeShopID;
    private String name;
    private String Address;
    private Integer colOdEmp;
    private int phoneNumber;

    public CoffeeShop(Integer coffeeShopID, String name, String address, Integer colOdEmp, int phoneNumber) {
        this.coffeeShopID = coffeeShopID;
        this.name = name;
        Address = address;
        this.colOdEmp = colOdEmp;
        this.phoneNumber = phoneNumber;
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
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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