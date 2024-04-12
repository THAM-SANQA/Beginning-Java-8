/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_05_01;

/**
 *
 * @author user1
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // declaring purchhase order
        String custName = "Mary Smith", itemDesc = " Shirt", message;
        // declaring price, etc.
        double price = 36.69, vat = 1.15, total;
        int quantity = 3;
        // calculating total
        total = price * quantity * vat;
        
        boolean outOfStock = false;
        if (quantity>1) {
            itemDesc+="s";
        }
        message = custName + " wants to purchase " + quantity + itemDesc;
        if (outOfStock) {
            System.out.println("We are out Of Stock.");
        }else{
            System.out.println(message);
            System.out.println("The total cost for the" + itemDesc
                + " is: R" + String.format("%.2f", total) + ".");        
        }
    }
    
}
