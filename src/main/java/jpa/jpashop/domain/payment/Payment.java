package jpa.jpashop.domain.payment;

import jakarta.persistence.*;
import jpa.jpashop.domain.Order;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Entity @Slf4j
public class Payment {

    @Id @GeneratedValue
    @Column(name = "payment_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Enumerated(EnumType.STRING)
    private Payment_method payment_method;

    @Enumerated(EnumType.STRING)
    private Payment_status payment_status;

    private int amount_of_payment;
    private int transaction_id;

    private LocalDate created_at;
    private LocalDate approved_at;
    private LocalDate canceled_at;
}
