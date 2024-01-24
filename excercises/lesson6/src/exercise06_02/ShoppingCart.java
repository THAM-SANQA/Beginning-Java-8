/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06_02;

/**
 * 
 * @author thamsanqa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Item object_1 = new Item(), object_2 = new Item();
        object_1.desc = "Vest";
        object_2.desc = "Pants";
        System.out.println("Object 1: " + object_1.desc);
        System.out.println("Object 2: " + object_2.desc);
        object_2 = object_1;
        System.out.println("Object 1: " + object_1.desc);
        System.out.println("Object 2: " + object_2.desc);
    }
}
