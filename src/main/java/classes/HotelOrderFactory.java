package classes;

import classes.hotels.HotelOne;
import classes.hotels.HotelTwo;
import interfaces.Hotel;
import interfaces.OrderAbstractFactory;

import java.util.ArrayList;

public class HotelOrderFactory implements OrderAbstractFactory {
    Hotel chosenHotel = null;

    @Override
    public Hotel createOrder(String hotel) {

        if(hotel.equalsIgnoreCase(HotelOne.name)) {
            chosenHotel = HotelOne.getInstance();
        }
        if(hotel.equalsIgnoreCase(HotelTwo.name)) {
            chosenHotel = HotelTwo.getInstance();;
        }
        return chosenHotel;
    }

    @Override
    public ArrayList<String> getAll() {
        ArrayList<String> hotels = new ArrayList<>();
        hotels.add(HotelOne.name);
        hotels.add(HotelTwo.name);
        return hotels;
    }

    @Override
    public void searchFree() {
        System.out.print("Searching free rooms: ");
        for (Integer room : chosenHotel.getFree()) {
            System.out.print(room + 1 + " ");
        }
        System.out.println();
    }

    @Override
    public void rent(int[] number) {
        for (int i = 0; i < number.length; i++) {
            chosenHotel.rent(number[i] - 1);
        }
    }

}
