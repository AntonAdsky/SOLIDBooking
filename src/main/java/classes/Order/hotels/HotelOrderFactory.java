package classes.Order.hotels;

import classes.Order.hotels.data.HotelOne;
import classes.Order.hotels.data.HotelTwo;
import interfaces.Hotel;
import interfaces.Order;
import interfaces.OrderAbstractFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HotelOrderFactory implements OrderAbstractFactory<Order> {

    @Override
    public Hotel createOrder(String hotel) {
        if (hotel.equalsIgnoreCase(HotelOne.name)) {
            return HotelOne.getInstance();
        } else if (hotel.equalsIgnoreCase(HotelTwo.name)) {
            return HotelTwo.getInstance();
        }
        return null;
    }

    @Override
    public Map<String, ArrayList<Integer>> getAll() {
        Map<String, ArrayList<Integer>> hotels = new HashMap<>();
        hotels.put(HotelOne.name, HotelOne.getInstance().getFree());
        hotels.put(HotelTwo.name, HotelTwo.getInstance().getFree());
        return hotels;
    }
}
