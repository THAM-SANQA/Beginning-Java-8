/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_05_02;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith",
                clothes[] = {"vests", "pants", "perfumes", "hats"},
                message = custName + " is looking for " + clothes.length + " items.";
        System.out.println(message);
        System.out.println("One of the items is " + clothes[2]);
        // Error: Index 4 out of bounds for length 4
        //System.out.println("One of the items is " + clothes[4]);

    }
}
