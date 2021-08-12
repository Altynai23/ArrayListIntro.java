package day43_OOP_Encapsulation.items_Task;

import java.util.ArrayList;
import java.util.Arrays;
import static day43_OOP_Encapsulation.items_Task.MyCart.*;

public class Check_Out {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                item1, item2, item3, item4, item5
        ));

        /*
        for(int i =0; i <= items.size()-1; i++){
            Item eachItem = items.get(i);
        }
         */
        double totalCost = 0;

        for(Item eachItem : items){
            totalCost += eachItem.calcCost() * 1.08;
        }

        System.out.println("totalCost = " + totalCost);



    }

}
