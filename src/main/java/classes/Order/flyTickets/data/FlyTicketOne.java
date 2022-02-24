package classes.Order.flyTickets.data;


import classes.Order.Order;
import interfaces.FlyTicket;

public class FlyTicketOne extends Order implements FlyTicket {
    private static FlyTicketOne INSTANCE;
    public static String name = "FlyTicketOne";


    private FlyTicketOne() {
        slots = new int[]{0, 0};
        price = 1000;
        slotName = "King's seat";
    }

    public static FlyTicketOne getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FlyTicketOne();
        }
        return INSTANCE;
    }
}
