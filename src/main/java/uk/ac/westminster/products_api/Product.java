package uk.ac.westminster.products_api;

/**
 * Tutorial 2 - Activity 1 & 2.
 *
 * Encapsulated Product: private fields, a no-argument constructor
 * (needed later by Jackson for POST request bodies), a full constructor
 * and JavaBean getters.
 */
public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
