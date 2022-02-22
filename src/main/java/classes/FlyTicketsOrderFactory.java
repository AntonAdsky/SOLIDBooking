package classes;

import classes.flyTickets.FlyTicketOne;
import classes.flyTickets.FlyTicketTwo;
import interfaces.FlyTicket;
import interfaces.OrderAbstractFactory;

public class FlyTicketsOrderFactory implements OrderAbstractFactory {
    FlyTicket chosenFlyTicket = null;

    @Override
    public FlyTicket createOrder(String hotel) {

        if (hotel.equalsIgnoreCase(FlyTicketOne.name)) {
            chosenFlyTicket = FlyTicketOne.getInstance();
        }
        if (hotel.equalsIgnoreCase(FlyTicketTwo.name)) {
            chosenFlyTicket = FlyTicketTwo.getInstance();
        }
        return chosenFlyTicket;
    }


    @Override
    public void searchFree() {
        System.out.print("Searching free seats: ");
        for (Integer seats : chosenFlyTicket.getFree()) {
            System.out.print(seats + 1 + " ");
        }
        System.out.println();
    }

    @Override
    public void rent(int[] number) {
        for (int i = 0; i < number.length; i++) {
            chosenFlyTicket.rent(number[i] - 1);
        }
    }
}
