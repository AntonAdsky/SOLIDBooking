package services;


import interfaces.OrderAbstractFactory;

public class OrderBuilderService {

    public void makeOrder(OrderAbstractFactory factory, String name) {
        factory.createOrder(name);
        System.out.println("Order " + name + " confirmed!");
    }

}
