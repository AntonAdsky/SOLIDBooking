package classes.flyTickets;

import interfaces.FlyTicket;

public class FlyTicketTwo extends FlyTicketController {
    private static FlyTicket INSTANCE;
    public static String name = "FlyTicketTwo";


    private FlyTicketTwo() {
        seats = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        price = 250;
    }

    public static FlyTicket getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FlyTicketTwo();
        }
        return INSTANCE;
    }
}
