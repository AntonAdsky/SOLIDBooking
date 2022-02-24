package classes.Order.flyTickets.data;

import classes.Order.Order;
import interfaces.FlyTicket;

public class FlyTicketTwo extends Order implements FlyTicket {
    private static FlyTicket INSTANCE;
    public static String name = "FlyTicketTwo";


    private FlyTicketTwo() {
        slots = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        price = 250;
        slotName = "seat";
    }

    public static FlyTicket getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FlyTicketTwo();
        }
        return INSTANCE;
    }
}
