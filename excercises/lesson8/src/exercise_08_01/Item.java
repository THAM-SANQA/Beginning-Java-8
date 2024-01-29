/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_08_01;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class Item {

//    public String description;
//    public char colorCode;
//    public double price;
//
//    public Item(){
//        description = "--description required--";
//        colorCode = 'U';
//        price=0.0;
//        this.display();
//    }
////Methods 
//    public void display() {
//        System.out.println("Shirt description: " + description);
//        System.out.println("Color Code: " + colorCode);
//        System.out.println("Shirt price: " + price);
//    }
//    public double calculate(int x, double y){ 
//        return(x/y); 
//    }
//    public int sum(int x, int y){
//        return x+y;
//    }
    public boolean isNew;

    public boolean isNewCustomer() {
        return isNew;
    }

    public void sendEmail(String message) {
        System.out.println(message);
    }
}

