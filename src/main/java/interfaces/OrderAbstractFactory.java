package interfaces;


public interface OrderAbstractFactory<T> {
    T createOrder(String title);
    void searchFree();
    void rent(int[] number);
}
