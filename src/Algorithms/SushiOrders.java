package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class SushiOrders {


    public static void main(String[] args) {

        ArrayList<SushiOrder> request = new ArrayList<>(
                Arrays.asList(
                        new SushiOrder(1, // seatId for this order
                                new ArrayList<>(Arrays.asList(
                                        // menuItemIds for this order
                                        "tuna", "california", "avocado"))
                        ),
                        new SushiOrder(3,
                                new ArrayList<>(Arrays.asList(
                                        "avocado"))
                        ),
                        new SushiOrder(2,
                                new ArrayList<>(Arrays.asList(
                                        "salmon", "tuna", "crab", "scallop"))
                        )
                )
        );


        PriorityQueue<SushiItem> menuItems = new PriorityQueue<>();
//        }
        List<SushiOrder> result = request.stream().sorted((item1, item2) -> item1.getSeatId() -item2.getSeatId()).collect(Collectors.toList());

        result.forEach(item ->{



            System.out.println(item.toString());
        });
    }




}





class SushiOrderManager {


    PriorityQueue<SushiItem> menuItems = new PriorityQueue<>();

    public SushiOrderManager() {
        /* initialize class state */

    }



    public void addOrder(ArrayList<SushiOrder> request) {

        /* add request to current batch of orders */
        //---> we shall add logic to adding items to the queue

        //---------> we first sort usind the table id

        List<SushiOrder> result = request.stream().sorted((item1, item2) -> item1.getSeatId() -item2.getSeatId()).collect(Collectors.toList());




        result.forEach(sushiOrder ->{




        });



    }

    public SushiItem nextItem() {
        // return next roll object in the format
        // new SushiItem(/*seatId*/ 1, /*menuItemId*/ "tuna");
        // or null if no order is pending
        return null;
    }
}


class SushiItem {
    int seatId;
    String menuItemId;
    public SushiItem(int seatId, String menuItemId) {

    }

    public int getSeatId() {
        return this.seatId;
    }

    public String getMenuItemId() {

        return this.menuItemId;
    }

    @Override
    public String toString() {
        return "{" +
                "seatId:" + seatId +
                ", menuItemId:'" + menuItemId + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        return false;
    }
}

class SushiOrder {
    int seatId;
    ArrayList<String> menuItemIds;
    public SushiOrder(int seatId, ArrayList<String> menuItemIds) {
        this.seatId = seatId;
        this.menuItemIds = menuItemIds;
    }

    public int getSeatId() {
        return this.seatId;
    }

    public ArrayList<String> getMenuItemIds() {
        return this.menuItemIds;
    }

    @Override
    public String toString() {
        return "SushiOrder{" +
                "seatId=" + seatId +
                ", menuItemIds=" + menuItemIds +
                '}';
    }
}