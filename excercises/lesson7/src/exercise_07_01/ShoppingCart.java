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
        String myString = "Hello";
        System.out.println("Original " + myString);
        myString = myString.concat(" World");
        System.out.println("Update 1: " + myString);
        myString = myString + "!";
        System.out.println("Update 2: " + myString);

        int stringLength = myString.length();
        System.out.println("String Length: " + stringLength);
    }

}
