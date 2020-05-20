/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olineshopping;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ShoppingCart {

    private ArrayList<OrderedItem> itemm;

    public ShoppingCart() {
        itemm = new ArrayList<>();
    }

    public void addItems(OrderedItem item) {
        itemm.add(item);
    }

    public void displayCart() {
        for (OrderedItem item : itemm) {
            System.out.println(item.getProduct());
            System.out.println("*****************************");
            System.out.println("quantity :" + item.getQuantity());
            System.out.println("----------------------------");
        }
    }

}
