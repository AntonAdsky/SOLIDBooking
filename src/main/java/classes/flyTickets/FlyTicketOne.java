package classes.flyTickets;

import interfaces.FlyTicket;

public class FlyTicketOne implements FlyTicket {
    public static String name = "FlyTicketOne";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
