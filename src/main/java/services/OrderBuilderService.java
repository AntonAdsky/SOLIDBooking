package services;


import interfaces.Order;
import interfaces.OrderAbstractFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderBuilderService {

    private OrderAbstractFactory<Order> factory;
    private final Map<String, Order> orderList = new HashMap<>();
    private String name;

    public void makeOrder(OrderAbstractFactory<Order> factory) {
        this.factory = factory;
    }

    public void set(String name) {
        this.name = name;
        orderList.put(name, factory.createOrder(name));
        System.out.println("Make order for " + name);
    }

    public void searchFree() {
        System.out.println("Searching free rooms: ");
        for (Map.Entry<String, Order> entry : orderList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int free: entry.getValue().getFree()) {
                System.out.print(free + 1 + " ");
            }
            System.out.println();
        }
    }

    public void rent(int[] number) {
        for (int n: number) {
            orderList.get(name).rent(n);
        }
    }

    public void  getAll(){
        System.out.println("Fetch available data!");
        Map<String, ArrayList<Integer>> arrayListMap = factory.getAll();
        for (Map.Entry<String, ArrayList<Integer>> entry : arrayListMap.entrySet()) {
            System.out.print("\"" + entry.getKey() + "\" free slots: ");
            for (Object slot: entry.getValue()) {
                System.out.print(slot + " ");
            }
            System.out.println();
        }
    }

    public void confirmedOrder() {
        System.out.print("Order for: ");
        for (Map.Entry<String, Order> entry : orderList.entrySet()) {
            System.out.print("\"" + entry.getKey() + "\" ");
        }
        System.out.print("confirmed!\n\n\n");
    }

}
