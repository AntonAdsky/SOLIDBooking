package classes;

import classes.hotels.HotelOne;
import classes.hotels.HotelTwo;
import interfaces.Hotel;
import interfaces.OrderAbstractFactory;

public class HotelOrderFactory implements OrderAbstractFactory {
    Hotel chosenHotel = null;

    @Override
    public Hotel createOrder(String hotel) {

        if(hotel.equalsIgnoreCase(HotelOne.name)) {
            chosenHotel = new HotelOne();
        }
        if(hotel.equalsIgnoreCase(HotelTwo.name)) {
            chosenHotel = new HotelTwo();
        }
        return chosenHotel;
    }

}
