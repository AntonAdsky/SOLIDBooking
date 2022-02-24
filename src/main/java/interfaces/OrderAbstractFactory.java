package interfaces;


import java.util.ArrayList;
import java.util.Map;

public interface OrderAbstractFactory<Order> {
    Order createOrder(String title);
    Map<String, ArrayList<Integer>> getAll();
}
