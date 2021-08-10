package day42_CustomClassConstructors.warmupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObjects {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("Turkish Delight", 3, 50),
                new Item("Cheese", 6, 70),
                new Item("Soap", 2, 60),
                new Item("Baklava", 10, 50),
                new Item("Soda", 6.5, 100),
                new Item("Cake", 3.5, 50),
                new Item("Gum", 2.2, 150),
                new Item("Tomato Sauce", 1.5, 140),
                new Item("Pizza Sauce", 1.7, 130),
                new Item("Salsa Sause", 1.7, 130)
        ));

        //items.removeIf( item -> items.unitPrice > 3);

        double totalPrice = 0;

        for(Item eachItem : items){
            totalPrice += eachItem.calcCost();
        }

        System.out.println("totalPrice = " + totalPrice);






    }
}
