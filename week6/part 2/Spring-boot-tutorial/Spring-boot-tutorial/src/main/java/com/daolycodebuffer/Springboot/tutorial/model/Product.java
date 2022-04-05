package com.daolycodebuffer.Springboot.tutorial.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data                                                            //getters and setters
@AllArgsConstructor                                              //annotation indicates that the class is a persistent Java class
@NoArgsConstructor
@Builder
@Table(name = "product")                                       //annotation provides the table that maps this entity
public class Product {


    @Id                                                        //annotation is for the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)            //annotation is used to define generation strategy for the primary key
    private Long productID;


    @Column(name = "product_name", nullable = false)                             //annotation is used to define the column in database that maps annotated field
    private String name;

    @Column(name = "cost", nullable = false)
    private Double cost;

    @Column(name = "date_of_manifacture", nullable = false)
    private String dateOfManifacture;

    @Column(name = "expiry_date", nullable = false)
    private String  expiryDate;

    // @NoArgsConstructor

    public Product(String name, double cost, String dateOfManifacture, String expiryDate) {                            // @AllArgsConstructor

        this.name = name;
        this.cost = cost;
        this.dateOfManifacture = dateOfManifacture;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product [id=" + productID + ", product name=" + name + ", cost=" + cost + ", Date Of Manifacture=" + dateOfManifacture + ", Expiry Date=" + expiryDate + "]";
    }
}