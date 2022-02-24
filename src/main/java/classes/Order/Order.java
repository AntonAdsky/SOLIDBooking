package classes.Order;

import java.util.ArrayList;

public abstract class Order implements interfaces.Order {
    public int price = 0;
    public int[] slots = null;
    public String slotName;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void rent(int number) {
        System.out.println("Try to rent " + slotName + " №" + (number));
        if((number - 1) >= slots.length) {
            System.out.println("Wrong " + slotName + " number!");
            return;
        }
        for (int i = 0; i < slots.length; i++) {
            if(i == (number - 1)) {
                if(slots[i] == 0 ) {
                    slots[i] = 1;
                    System.out.println(slotName + " №" + number + " was rend!");
                }else {
                    System.out.println(slotName +  " №" + number + " is already rend!");
                }
            }
        }
    }

    @Override
    public ArrayList<Integer> getFree() {
        ArrayList<Integer> free = new ArrayList<>();
        for (int i = 0; i < slots.length; i++) {
            if(slots[i] == 0) {
                free.add(i);
            }
        }
        return free;
    }
}
