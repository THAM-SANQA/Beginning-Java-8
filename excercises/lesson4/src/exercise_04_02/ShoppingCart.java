/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_04_02;

/**
 *
 * @author user1
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // declaring purchhase order
        String custName = "Mary Smith", itemDesc = " Shirts", message;
        // declaring price, etc.
        double price = 36.69, vat = 1.15, total;
        int quantity = 3;
        // viewing purchase order
        message = custName + " wants to purchase " + quantity + itemDesc;
        System.out.println(message);
        // calculating total
        total = price * quantity * vat;
        System.out.println("The total cost for the" + itemDesc
                + " is: R" + String.format("%.2f", total) + ".");
    }
}
