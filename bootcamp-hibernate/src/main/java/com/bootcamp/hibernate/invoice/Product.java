package com.bootcamp.hibernate.invoice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne
    private Item item;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
