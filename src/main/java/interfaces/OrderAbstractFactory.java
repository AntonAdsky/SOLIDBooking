package interfaces;


public interface OrderAbstractFactory<T> {
    T createOrder(String title);

}
