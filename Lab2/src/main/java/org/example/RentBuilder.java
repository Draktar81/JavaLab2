package org.example;

import java.util.Objects;

public class RentBuilder {
    Room room;
    Customer customer;
    String dateOfStart;
    String dateOfEnd;
    String paymentDetails;
    double price;

    public RentBuilder setRoom(Room room) {
        this.room = room;
        return this;
    }

    public RentBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public RentBuilder setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
        return this;
    }

    public RentBuilder setDateOfEnd(String dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
        return this;
    }

    public RentBuilder setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
    }

    public RentBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Rent build() {
        return new Rent(room, customer, dateOfStart, dateOfEnd, paymentDetails, price);
    }
}
