/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_05_03;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Kat Niggress",
        clothes[] = {"Vests", "Pants", "Perfumes", "Hats"},
        message = custName + " is looking for " + clothes.length + " items.";
        System.out.println(message);
        int x = 1;
        System.out.println("Items purchased: ");
        for (String item : clothes ){
            System.out.println(x++ + ". " + item);
        }
    }
    }

