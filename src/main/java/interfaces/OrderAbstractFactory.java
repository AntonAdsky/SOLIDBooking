package interfaces;


import java.util.ArrayList;
import java.util.Map;

public interface OrderAbstractFactory<T> {
    T createOrder(String title);
    void searchFree();
    void rent(int[] number);
    Map<String, ArrayList<Integer>> getAll();
}
