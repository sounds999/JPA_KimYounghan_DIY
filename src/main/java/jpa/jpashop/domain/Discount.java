package jpa.jpashop.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
public class Discount {

    @Enumerated
    private DiscountType type;

    private int discount_value;
    private String discount_name;
    private LocalDateTime discount_date;
    //   LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 9, 12, 30);
}
