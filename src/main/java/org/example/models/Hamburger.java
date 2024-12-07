package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {

        System.out.println("name: " + this.name
                + " " + addition1Name
                + " " + addition2Name + " "
                + addition3Name + " "
                + addition4Name + " "
                + "meat: " + this.meat + " "
                + "bread: " + this.breadRollType);

        if (addition1Name != null) {
            System.out.println("Added " + addition1Name + " for $" + addition1Price);
            price += addition1Price;
        }

        if (addition2Name != null) {
            System.out.println("Added " + addition2Name + " for $" + addition2Price);
            price += addition2Price;
        }

        if (addition3Name != null) {
            System.out.println("Added " + addition3Name + " for $" + addition3Price);
            price += addition3Price;
        }

        if (addition4Name != null) {
            System.out.println("Added " + addition4Name + " for $" + addition4Price);
            price += addition4Price;
        }

        return price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}
