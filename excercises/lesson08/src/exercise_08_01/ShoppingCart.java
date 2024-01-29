/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_08_01;

/**
 *
 * @author Thamsanqa Ndaba
 */

public class ShoppingCart {
 //   public static void main(String[] args) {
        // TODO code application logic here
//        Shirt myShirt = new Shirt();
//        //myShirt.display();
//        System.out.println("The end");
        
//        Item calc = new Item(); 
//        double denominator = 2.0; 
//        double answer;
//        answer = calc.calculate(3, denominator);
//        System.out.println(answer);

//        Item res = new Item();
//        double result = res.sum(5, 4);
////        double result = Item.sum(5, 4);
//        System.out.println(result);
        
        public static void setCustomerServices(Item cust) {
                    String message ="Would you like to hear about " +"special deals in your area?";  
                    if (cust.isNewCustomer()) { 
                        cust.sendEmail(message); 
                    }else{
                        cust.sendEmail("Are you pleased");
                    }
                }
        public static void main(String[] args) {
            Item cust = new Item();
            cust.isNew = true;
            setCustomerServices(cust);
        }
                    

}
//}
