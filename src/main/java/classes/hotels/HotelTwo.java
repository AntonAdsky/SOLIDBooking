package classes.hotels;

public class HotelTwo extends HotelController {
    private static HotelTwo INSTANCE;
    public static String name = "Hotel Two";

    private HotelTwo() {
        price = 10;
        rooms = new int[]{0,0,0,0};
    }

    public static HotelTwo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HotelTwo();
        }
        return INSTANCE;
    }
}
