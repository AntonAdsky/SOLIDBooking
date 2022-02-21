package classes.hotels;

import interfaces.Hotel;

public class HotelOne implements Hotel {
    public static String name = "Hotel One";
    int roomPrice = 5;
    int[] rooms = new int[]{0,0,0,0};

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRoomPrice() {
        return roomPrice;
    }

    @Override
    public int getRoomNumber() {
        for (int i = 0; i < rooms.length - 1; i++) {
            if(rooms[i] == 0) {
                return i + 1;
            }
        }
        return 0;
    }

    public int getRooms() {
        return rooms.length;
    }
}
