package classes.Order.flyTickets;

import classes.Order.flyTickets.data.FlyTicketOne;
import classes.Order.flyTickets.data.FlyTicketTwo;
import interfaces.FlyTicket;
import interfaces.Order;
import interfaces.OrderAbstractFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlyTicketsOrderFactory implements OrderAbstractFactory<Order> {

    @Override
    public FlyTicket createOrder(String hotel) {
        if (hotel.equalsIgnoreCase(FlyTicketOne.name)) {
            return FlyTicketOne.getInstance();
        }
        if (hotel.equalsIgnoreCase(FlyTicketTwo.name)) {
            return FlyTicketTwo.getInstance();
        }
        return null;
    }

    @Override
    public Map<String, ArrayList<Integer>> getAll() {
        Map<String, ArrayList<Integer>> flyTickets = new HashMap<>();
        flyTickets.put(FlyTicketOne.name, FlyTicketOne.getInstance().getFree());
        flyTickets.put(FlyTicketTwo.name, FlyTicketTwo.getInstance().getFree());
        return flyTickets;
    }

}
