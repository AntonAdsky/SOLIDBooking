package interfaces;

import java.util.ArrayList;

public interface FlyTicket {
    int getPrice();
    void rent(int number);
    ArrayList<Integer> getFree();
}
