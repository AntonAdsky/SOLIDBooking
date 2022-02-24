package test;

import classes.Client;
import classes.FabricProvider;
import classes.Order.flyTickets.data.FlyTicketOne;
import classes.Order.flyTickets.data.FlyTicketTwo;
import classes.Order.hotels.data.HotelOne;
import classes.Order.hotels.data.HotelTwo;

public class TestScenarios {
    // test client 1
    public static void client1() {
        System.out.println("--- Client 1 start making order ---");
        Client client = new Client();
        client.getMakeOrder(FabricProvider.Fabrics.HOTEL);
        client.search();

        client.setProduct(HotelOne.name);
        client.searchFree();
        client.rent(new int[]{1, 3});

        client.setProduct(HotelTwo.name);
        client.searchFree();
        client.rent(new int[]{2, 4});

        client.confirmedOrder();
    }

    // test client 2
    public static void client2() {
        System.out.println("--- Client 2 start making order ---");
        Client client = new Client();
        client.getMakeOrder(FabricProvider.Fabrics.FLY_TICKETS);
        client.search();

        client.setProduct(FlyTicketTwo.name);
        client.searchFree();
        client.rent(new int[]{1, 3});

        client.setProduct(FlyTicketOne.name);
        client.searchFree();
        client.rent(new int[]{2, 4});

        client.confirmedOrder();
    }

    public static void client3() {
        System.out.println("--- Client 3 start making order ---");
        Client client = new Client();
        client.getMakeOrder(FabricProvider.Fabrics.FLY_TICKETS);
        client.search();
    }
}
