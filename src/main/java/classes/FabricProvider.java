package classes;

import interfaces.OrderAbstractFactory;

public class FabricProvider {
    public enum Fabrics {
        HOTEL,
        FLY_TICKETS
    }

    public static OrderAbstractFactory getOrder(Fabrics type) {
        if (type == Fabrics.HOTEL) {
            return new HotelOrderFactory();
        } else if (type == Fabrics.FLY_TICKETS) {
            return new FlyTicketsOrderFactory();
        }

        return null;
    }
}
