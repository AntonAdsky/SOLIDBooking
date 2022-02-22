package classes.flyTickets;


public class FlyTicketOne extends FlyTicketController {
    private static FlyTicketOne INSTANCE;
    public static String name = "FlyTicketOne";


    private FlyTicketOne() {
        seats = new int[]{0, 0};
        price = 1000;
    }

    public static FlyTicketOne getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FlyTicketOne();
        }
        return INSTANCE;
    }

}
