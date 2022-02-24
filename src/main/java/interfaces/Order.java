package interfaces;

import java.util.ArrayList;

public interface Order {
    int getPrice();
    void rent(int number);
    ArrayList<Integer> getFree();
}
