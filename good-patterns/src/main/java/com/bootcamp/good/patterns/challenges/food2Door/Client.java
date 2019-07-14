package com.bootcamp.good.patterns.challenges.food2Door;

import java.util.Objects;

public class Client {
    private String name;
    private String address;
    private int phoneNumber;

    public Client(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return phoneNumber == client.phoneNumber &&
                Objects.equals(name, client.name) &&
                Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phoneNumber);
    }
}
