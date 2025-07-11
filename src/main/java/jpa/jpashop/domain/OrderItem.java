package jpa.jpashop.domain;

import jakarta.persistence.*;
import jpa.jpashop.domain.item.Item;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "orderItem_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Embedded
    private Discount discount;

    private int total_price;
    private int item_number;
}
