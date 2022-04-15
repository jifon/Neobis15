package net.proselyte.springsecuritydemo.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity //Person.builder().name("Adam Savage").city("San Francisco").job("Mythbusters").job("Unchained Reaction").build();
@Data
@NoArgsConstructor
@Table(name = "product", schema = "public", catalog = "construction")                                       //annotation provides the table that maps this entity
public class Product {

    @Id                                                        //annotation is for the primary key
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.AUTO)            //annotation is used to define generation strategy for the primary key
    private Long id;
    @Column(name = "product_name", nullable = false)                             //annotation is used to define the column in database that maps annotated field
    private String name;
    @Column(name = "price", nullable = false)
    private Double price;
    @Column(name = "date_of_manifacture", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfManifacture;
    @Column(name = "expiry_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date  expiryDate;
    @ManyToMany(mappedBy="productList",fetch=FetchType.LAZY)
    private List<Order> orderList;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(String name, Double price, Date dateOfManifacture, Date expiryDate, List<Order> orderList, Category category) {
        this.name = name;
        this.price = price;
        this.dateOfManifacture = dateOfManifacture;
        this.expiryDate = expiryDate;
        this.orderList = orderList;
        this.category = category;
    }

    public Product(String name, Double price, Date dateOfManifacture, Date expiryDate, Category category) {
        this.name = name;
        this.price = price;
        this.dateOfManifacture = dateOfManifacture;
        this.expiryDate = expiryDate;
        this.category = category;
    }
}
