package classes.flyTickets;

import interfaces.FlyTicket;

public class FlyTicketTwo implements FlyTicket {
    public static String name = "FlyTicketTwo";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
