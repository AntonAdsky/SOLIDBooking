package classes.hotels;

public class HotelOne extends HotelController {
    private static HotelOne INSTANCE;
    public static String name = "Hotel One";

    private HotelOne() {
        price = 5;
        rooms = new int[]{0, 0, 0, 0};
    }

    public static HotelOne getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HotelOne();
        }
        return INSTANCE;
    }

}
