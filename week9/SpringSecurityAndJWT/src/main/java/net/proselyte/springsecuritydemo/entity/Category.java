package net.proselyte.springsecuritydemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "categories", schema = "public", catalog = "construction")
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> productList;

    public Category(Integer id, String name, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }
}

