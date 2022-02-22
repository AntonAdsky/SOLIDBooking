package interfaces;

import java.util.ArrayList;

public interface Hotel {
    int getPrice();
    void rent(int number);
    ArrayList<Integer> getFree();
}
