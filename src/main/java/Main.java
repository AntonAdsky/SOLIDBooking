import classes.FabricProvider;
import classes.flyTickets.FlyTicketTwo;
import classes.hotels.HotelOne;
import services.OrderBuilderService;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        OrderBuilderService service = new OrderBuilderService();

        service.makeOrder(Objects.requireNonNull(FabricProvider.getOrder(FabricProvider.HOTEL)), HotelOne.name);
        service.makeOrder(Objects.requireNonNull(FabricProvider.getOrder(FabricProvider.FLY_TICKETS)), FlyTicketTwo.name);
    }
}
