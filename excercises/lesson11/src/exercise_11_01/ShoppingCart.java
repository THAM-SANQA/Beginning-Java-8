/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_11_01;

/**
 *
 * @author Thamsanqa Ndaba
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime orderDate;

        orderDate = LocalDateTime.now();
        System.out.println("Order date: " + orderDate);

        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: " + fDate);
    }

}
