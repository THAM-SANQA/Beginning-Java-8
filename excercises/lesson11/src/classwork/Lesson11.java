/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classwork;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.temporal.TemporalAccessor;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class Lesson11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate myDate = LocalDate.now();
        System.out.println("Today's date: " + myDate);
        LocalDate myDate1 = myDate.minusMonths(15);
        System.out.println("Today's date - 15 months: " + myDate1);    
    }

}
