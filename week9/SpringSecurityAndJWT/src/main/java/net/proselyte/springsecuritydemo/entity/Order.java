package net.proselyte.springsecuritydemo.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "order", schema = "public", catalog = "construction")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ORDER_DETAIL",
            joinColumns=
            @JoinColumn(name="ORDER_ID", referencedColumnName="order_id"),
            inverseJoinColumns=
            @JoinColumn(name="PROD_ID", referencedColumnName="prod_id")
    )
    private List<Product> productList;

    public Order(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }


}

