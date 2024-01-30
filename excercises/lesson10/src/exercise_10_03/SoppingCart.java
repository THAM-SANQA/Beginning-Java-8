/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_10_02;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class SoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
        Order order1 = new Order("Rick ", 10.00, "VA", Order.PRIVATE);
        System.out.println("Discount is: "+ order1.getDiscount());
    }
}
