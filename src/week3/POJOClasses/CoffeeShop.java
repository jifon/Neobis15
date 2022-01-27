package week3.POJOClasses;

import java.util.Scanner;

public class CoffeeShop {

    private String name;
    private String Address;
    private int phoneNumber;

    public CoffeeShop(String name, String address, int phoneNumber) {
        this.name = name;
        Address = address;
        this.phoneNumber = phoneNumber;
    }

    public CoffeeShop() {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}