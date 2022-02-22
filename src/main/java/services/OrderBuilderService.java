package services;


import interfaces.OrderAbstractFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderBuilderService {

    private OrderAbstractFactory factory;
    Map<String, Object> orderList = new HashMap<>();

    public void makeOrder(OrderAbstractFactory factory) {
        this.factory = factory;
    }

    public void set(String name) {
        orderList.put(name, factory.createOrder(name));
        System.out.println("Make order for " + name);
    }

    public void searchFree() {
        factory.searchFree();
    }

    public void rent(int[] number) {
        factory.rent(number);
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
        for (Map.Entry<String, Object> entry : orderList.entrySet()) {
            System.out.print("\"" + entry.getKey() + "\" ");
        }
        System.out.print("confirmed!\n\n\n");
    }

}
