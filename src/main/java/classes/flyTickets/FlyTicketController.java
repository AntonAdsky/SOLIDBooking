package classes.flyTickets;

import interfaces.FlyTicket;

import java.util.ArrayList;

public abstract class FlyTicketController implements FlyTicket {
    int price = 0;
    int[] seats = new int[]{0, 0, 0, 0};

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void rent(int number) {
        System.out.println("Try to rent seat №" + (number + 1));
        if(number > seats.length) {
            System.out.println("Wrong room number!");
            return;
        }

        for (int i = 0; i < seats.length; i++) {
            if (i  == number) {
                if (seats[i] == 0) {
                    seats[i] = 1;
                    System.out.println("Seat №" + (number + 1) + " was rend!");
                } else if (seats[i] == 1) {
                    System.out.println("Seat №" + (number + 1) + " is already rend!");
                }
            }
        }
    }

    @Override
    public ArrayList<Integer> getFree() {
        ArrayList<Integer> free = new ArrayList();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                free.add(i);
            }
        }
        return free;
    }
}
