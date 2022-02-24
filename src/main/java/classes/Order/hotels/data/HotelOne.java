package classes.Order.hotels.data;

import classes.Order.Order;
import interfaces.Hotel;

public class HotelOne extends Order implements Hotel {
    private static HotelOne INSTANCE;
    public static String name = "Hotel One";

    private HotelOne() {
        price = 5;
        slots = new int[]{0, 0, 0, 0};
        slotName = "room";
    }

    public static HotelOne getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HotelOne();
        }
        return INSTANCE;
    }

}
