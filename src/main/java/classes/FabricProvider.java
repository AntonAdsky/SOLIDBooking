package classes;

import interfaces.OrderAbstractFactory;

public class FabricProvider {
    public static final String HOTEL = "Hotel";
    public static final String FLY_TICKETS = "flyTickets";


    public static OrderAbstractFactory getOrder(String type) {
        if (type.equalsIgnoreCase(HOTEL)) {
            return new HotelOrderFactory();
        } else if (type.equalsIgnoreCase(FLY_TICKETS)) {
            return new FlyTicketsOrderFactory();
        }

        return null;
    }
}
