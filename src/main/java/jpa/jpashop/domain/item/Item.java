package jpa.jpashop.domain.item;

import jakarta.persistence.*;
import jpa.jpashop.domain.Category;
import jpa.jpashop.domain.OrderItem;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Entity @Slf4j
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public abstract class Item {

    @Id @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "item")
    private List<OrderItem> orderItems = new ArrayList<>();

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Size size;

    private String color;
    private String name;
    private int price;
    private int stockQuantity;
}
