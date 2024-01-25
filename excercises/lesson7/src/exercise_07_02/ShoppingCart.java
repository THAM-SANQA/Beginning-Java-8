/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_07_02;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Kat Niggress";
        int spaceIdx = custName.indexOf(' ');
        String firstName = custName.substring(0,spaceIdx);
        //System.out.println(firstName);
        
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(custName.substring(spaceIdx));
        System.out.println(sb);
        
    }
}
