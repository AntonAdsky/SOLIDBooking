package classes.hotels;

import interfaces.Hotel;

import java.util.ArrayList;

public abstract class HotelController implements Hotel {
    int price = 5;
    int[] rooms = new int[]{0,0,0,0};

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void rent(int number) {
        System.out.println("Try to rent Room №" + (number + 1));
        if(number > rooms.length) {
            System.out.println("Wrong room number!");
            return;
        }
        for (int i = 0; i < rooms.length; i++) {
            if(i == number) {
                if(rooms[i] == 0 ) {
                    rooms[i] = 1;
                    System.out.println("Room №" + (number + 1) + " was rend!");
                }else {
                    System.out.println("Room №" + (number + 1) + " is already rend!");
                }
            }
        }
    }

    @Override
    public ArrayList<Integer> getFree() {
        ArrayList free = new ArrayList();
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] == 0) {
                free.add(i);
            }
        }
        return free;
    }
}
