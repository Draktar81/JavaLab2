package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Room room1 = new Room("Luxury", 5,355, "Best of the best");
        Room room2 = new Room("Comfort", 3, 152,"Strong comfort");

        Customer customer1 = new Customer("Bochman", "Fistasi", "received", "20.05.1979");
        Customer customer2 = new Customer("Gromilda","Lebuchi", "received", "11.10.1965" );

        Rent rent1 = new RentBuilder()
                .setRoom(room1)
                .setCustomer(customer1)
                .setDateOfEnd("15.07.2024")
                .setDateOfStart("10.07.2024")
                .setPrice(765.0)
                .setPaymentDetails("card")
                .build();

        Rent rent2 = new RentBuilder()
                .setRoom(room2)
                .setCustomer(customer2)
                .setDateOfEnd("17.07.2024")
                .setDateOfStart("08.07.2024")
                .setPrice(495.0)
                .setPaymentDetails("cash")
                .build();

        RentService rentService = new RentService();
        rentService.addRent(rent1);
        rentService.addRent(rent2);

        System.out.println("Rents sorted by price:");
        System.out.println(rentService.getRentsByPrice());

        System.out.println("Cheapest rent price");
        System.out.println(rentService.getCheapestRent());

        System.out.println("Get Rents by payment details");
        System.out.println(rentService.getRentByPaymentDetails("card"));

    }
}