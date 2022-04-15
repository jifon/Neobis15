package net.proselyte.springsecuritydemo.entity;

import lombok.Data;
import net.proselyte.springsecuritydemo.entity.constants.Role;
import net.proselyte.springsecuritydemo.entity.constants.Status;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users", schema = "public", catalog = "construction")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @OneToMany(mappedBy = "user",targetEntity=Order.class, fetch=FetchType.EAGER)
    private List<Order> orders;


}
