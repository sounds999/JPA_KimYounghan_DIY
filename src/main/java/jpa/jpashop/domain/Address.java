package jpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j @Embeddable
public class Address {
    private String city;
    private String street;
    private String zip_number;

    public Address(String city, String street, String zip_number) {
        this.city = city;
        this.street = street;
        this.zip_number = zip_number;
    }
}
