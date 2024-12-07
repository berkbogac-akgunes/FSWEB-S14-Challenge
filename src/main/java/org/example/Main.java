package org.example;

import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;
import org.example.models.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        /*
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, "Wrap");

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();
        */
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");

        healthyBurger.addHealthyAddition1("test", 2);
        healthyBurger.addHealthyAddition2("test", 2);
        healthyBurger.itemizeHamburger();

        System.out.println(healthyBurger.getPrice());
        /*
        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
         */
    }
}