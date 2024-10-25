package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RentService {

    private List<Rent> rentList;

    public RentService() {
        this.rentList  = new ArrayList<>();
    }

    public void addRent(Rent rent) {
        rentList.add(rent);
    }

    public List<Rent> getRentsByPrice() {
        return rentList.stream()
                .sorted(Comparator.comparingDouble(Rent::getPrice))
                .collect(Collectors.toList());
    }

    public Rent getCheapestRent() {
        return rentList.stream()
                .min(Comparator.comparingDouble(Rent::getPrice))
                .orElse(null);
    }

    public List<Rent> getRentByPaymentDetails(String paymentDetails) {
        return rentList.stream()
                .filter(rent -> rent.getPaymentDetails().equalsIgnoreCase(paymentDetails))
                .collect(Collectors.toList());
    }

}
