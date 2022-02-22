package interfaces;


import java.util.ArrayList;

public interface OrderAbstractFactory<T> {
    T createOrder(String title);
    void searchFree();
    void rent(int[] number);
    ArrayList<String> getAll();
}
