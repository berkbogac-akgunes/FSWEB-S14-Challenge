package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 19.10, "White");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No new ingredients can be added for Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No new ingredients can be added for Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No new ingredients can be added for Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No new ingredients can be added for Deluxe Burger.");
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public double getPrice() {
        return super.getPrice();
    }
}
