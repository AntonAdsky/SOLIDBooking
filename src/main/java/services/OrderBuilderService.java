package services;


import interfaces.OrderAbstractFactory;

public class OrderBuilderService {

    OrderAbstractFactory factory;
    String name;

    public void makeOrder(OrderAbstractFactory factory, String name) {
        this.factory = factory;
        this.name = name;
        factory.createOrder(name);
        System.out.println("Make order for " + name);
    }

    public void searchFree() {
        factory.searchFree();
    }

    public void rent(int[] number) {
        factory.rent(number);
    }

    public void confirmedOrder() {
        System.out.println("Order in \"" + name + "\" confirmed!\n");
    }

}
