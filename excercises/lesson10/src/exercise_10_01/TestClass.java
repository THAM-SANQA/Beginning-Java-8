/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_10_01;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class TestClass {

    public static void main(String[] args) {
        int x = 6, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("Original 'x' = '" + x + "'.");
        // Replicate using ternary operator.
        x = 6;
        y = 9;
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("Replicate 'x' = '" + x + "'.");
    }
}
