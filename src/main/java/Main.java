import classes.FabricProvider;
import classes.flyTickets.FlyTicketOne;
import classes.flyTickets.FlyTicketTwo;
import classes.hotels.HotelOne;
import classes.hotels.HotelTwo;
import interfaces.OrderAbstractFactory;
import services.OrderBuilderService;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Main.rend(new int[]{2}, FabricProvider.HOTEL, HotelOne.name);
        Main.rend(new int[]{2}, FabricProvider.FLY_TICKETS, FlyTicketOne.name);
        Main.rend(new int[]{1, 3}, FabricProvider.HOTEL, HotelTwo.name);
        Main.rend(new int[]{3,4,5}, FabricProvider.FLY_TICKETS, FlyTicketTwo.name);
        Main.rend(new int[]{2}, FabricProvider.HOTEL, HotelOne.name);
    }


    // POST rend
    public static void rend(int[] data, String fabricName, String title) {
        OrderBuilderService service = new OrderBuilderService();
        OrderAbstractFactory factory = (Objects.requireNonNull(FabricProvider.getOrder(fabricName)));
        // making order
        service.makeOrder(factory, title);
        // search free rooms
        service.searchFree();
        // rendRoom 2
        service.rent(data);
        // check
        service.searchFree();
        // comfirme
        service.confirmedOrder();
    }




}
