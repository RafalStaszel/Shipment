package com.juniorjava.service;
import com.juniorjava.model.City;
import com.juniorjava.model.Order;
import com.juniorjava.model.Product;
import java.util.Arrays;
import java.util.List;


public class Input {


    public List<Order> setLocationList() {

        return Arrays.asList(
                new Order(new City("Gliwice"), new Product("tprod-1", 10)),
                new Order(new City("Gliwice"), new Product("tprod-2", 12)),
                new Order(new City("Gliwice"), new Product("tprod-3", 5)),
                new Order(new City("Munich"), new Product("tprod-1", 4)),
                new Order(new City("Munich"), new Product("tprod-2", 4)),
                new Order(new City("Munich"), new Product("tprod-3", 4)),
                new Order(new City("Montreal"), new Product("tprod-1", 4)),
                new Order(new City("Montreal"), new Product("tprod-4", 5))
        );
    }

    public List<Order> setDestinationList() {

        return Arrays.asList(
                new Order(new City("Sydney"), new Product("tprod-1", 14)),
                new Order(new City("Sydney"), new Product("tprod-2", 10)),
                new Order(new City("Sydney"), new Product("tprod-3", 3)),
                new Order(new City("Tokyo"), new Product("tprod-2", 6)),
                new Order(new City("Sydney"), new Product("tprod-3", 1)),
                new Order(new City("Tokyo"), new Product("tprod-4", 5))
        );
    }
}

