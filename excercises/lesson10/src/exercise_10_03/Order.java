/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_10_03;

import exercise_10_02.*;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        switch (custType) {
            case NONPROFIT:
                discount = (total > 900) ? 10 : 5;
                break;
            case PRIVATE:
                discount = (total > 900) ? 7 : 0;
                break;
            case (CORP):
                discount = (total < 500) ? 8 : 5;
                break;
            default:
                System.out.println("Invalid custType");
        }
    }

}
