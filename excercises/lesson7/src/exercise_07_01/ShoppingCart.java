/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_07_01;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
//        String myString = "Hello";
//        System.out.println("Original " + myString);
//        myString = myString.concat(" World");
//        System.out.println("Update 1: " + myString);
//        myString = myString + "!";
//        System.out.println("Update 2: " + myString);
//
//        int stringLength = myString.length();
        //System.out.println("String Length: " + stringLength);
        
//        String greet = " HOW ".trim(); 
//        String lc = greet + "DY".toLowerCase();
//        System.out.println(lc);
//        System.out.println(lc.indexOf("how"));
        
//        String phoneNumber = "404-543-2345";
//        int idx1 = phoneNumber.indexOf('-');
//        System.out.println("index of 1st dash: "+ idx1);
//        int idx2 = phoneNumber.indexOf('-', idx1+1);
//        System.out.println("index of 2nd dash: "+ idx2);
        
//            StringBuilder mySB = new StringBuilder("Hello"); 
//            mySB.append(" World");
//            System.out.println(mySB);
        String custName = "Kat Niggress";
        int spaceIdx = custName.indexOf(' ');
        String firstName = custName.substring(0,spaceIdx);
        System.out.println(firstName);
    }

}
