package com.juniorjava.model;


public class Order {

    private City city;
    private Product product;
    private City endCity;


    public Order(City city, Product product, City endCity) {
        this.city = city;
        this.product = product;
        this.endCity = endCity;
    }

    public Order(City city, Product product) {
        this.city = city;
        this.product = product;
    }

    public City getCity() {
        return city;
    }

    public Product getProduct() {
        return product;
    }


    @Override
    public String toString() {
        return city.getName() + " " + endCity.getName() + " " + product.getName() + " " + product.getQuantity();
    }
}
