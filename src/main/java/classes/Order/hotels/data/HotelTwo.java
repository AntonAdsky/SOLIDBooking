package classes.Order.hotels.data;

import classes.Order.Order;
import interfaces.Hotel;

public class HotelTwo extends Order implements Hotel {
    private static HotelTwo INSTANCE;
    public static String name = "Hotel Two";

    private HotelTwo() {
        price = 10;
        slots = new int[]{0,0,0,0};
        slotName = "room";
    }

    public static HotelTwo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HotelTwo();
        }
        return INSTANCE;
    }
}
