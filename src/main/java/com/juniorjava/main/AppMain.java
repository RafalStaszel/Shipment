package com.juniorjava.main;

import com.juniorjava.model.City;
import com.juniorjava.model.Order;
import com.juniorjava.model.Product;
import com.juniorjava.service.Input;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AppMain {

    private List<Order> listLocation;
    private List<Order> listDestination;


    public static void main(String[] args) {

        AppMain app = new AppMain();
        app.findShipment();
    }


    public void findShipment() {

        Set<String> uniquePairs = new HashSet<>();
        List<Order> listShipment = new ArrayList<>();
        Input input = new Input();

        listLocation = input.setLocationList();
        listDestination = input.setDestinationList();

        for (int i = 0; i < listLocation.size(); i++) {

            for (int n = 0; n < listDestination.size(); n++) {

                int counter = 0;

                if (
                        listLocation.get(i).getProduct().getName() == listDestination.get(n).getProduct().getName()) {
                    while (listLocation.get(i).getProduct().getQuantity() > 0
                            && listDestination.get(n).getProduct().getQuantity() > 0) {

                        listLocation.get(i).getProduct().setQuantity(listLocation.get(i).getProduct().getQuantity() - 1);
                        listDestination.get(n).getProduct().setQuantity(listDestination.get(n).getProduct().getQuantity() - 1);

                        counter++;
                        uniquePairs.add(listLocation.get(i).getCity().getName() + "-"
                                + listDestination.get(n).getCity().getName());

                    } // koniec petli while

                    if (counter > 0) {

                        listShipment.add(new Order(
                                new City(listLocation.get(i).getCity().getName()),
                                new Product(listLocation.get(i).getProduct().getName(), counter),
                                new City(listDestination.get(n).getCity().getName())));

                    }

                } // koniec if-a

            } // koniec drugiej petli

        } //koniec pierwszej petli

        for (Order print : listShipment)
            System.out.println(print.toString());
        System.out.println();
        System.out.println(uniquePairs + " Ilosc tras unikalnych " + uniquePairs.size());

        //print: Ilosc tras unikalnych 5

    }

}


