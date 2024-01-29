/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classwork09;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class Lesson09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

class Customer {

    public boolean loyaltyDiscount;

    public boolean hasLoyaltyDiscount() {
        return loyaltyDiscount;
    }

    public void setLoyaltyDiscount(boolean discount) {
        loyaltyDiscount = discount;
    }
}

class Item {

    private double price = 15.50;
    static private int nextId;
    //private int id;

    public Item() {
        setId();
    }

    private void setId() {
        Item.nextId++;
        System.out.println("ID is: " + nextId);
    }

    public void setPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount()) {
            price = price * .85;
        }
        System.out.println("Price is: R" + String.format("%.2f", price));
    }
}

class Order {

    public static void main(String args[]) {
        Customer cust = new Customer();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        //item.price = 10.00;
        item1.setPrice(cust);
        item2.setPrice(cust);
        item3.setPrice(cust);
        item4.setPrice(cust);
    }
}

class Shirt {

    private int shirtID = 0; // Default ID for the shirt
    private String description = "-description required-"; // default
    private char colorCode = 'U'; //R=Red, B=Blue, G=Green, U=Unset
    private double price = 0.0; // Default price for all items

    public Shirt() {
        setColorCode('N');
    }
    // 1 argument constructor

    public Shirt(char colorCode) {
        setColorCode(colorCode);
    }
    // 2 argument constructor

    public Shirt(char colorCode, double price) {
        this(colorCode);
        setPrice(price);
    }

    public Shirt(char colorCode, String desc, double price) {
        this(colorCode,price);
        //setColorCode(colorCode);
        setDescription(desc);
        //setPrice(price);
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char newCode) {
        if (newCode == 'R') {
            colorCode = newCode;
            return;
        }
        if (newCode == 'Y') {
            colorCode = newCode;
            return;
        }
        if (newCode == 'B') {
            colorCode = newCode;
            return;
        }
        System.out.println(newCode + " is an invalid colorCode. Use 'R, Y, or B'");
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the shirtID
     */
    public int getShirtID() {
        return shirtID;
    }

    /**
     * @param shirtID the shirtID to set
     */
    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}

class ShirtTest {

    public static void main(String[] args) {
        Shirt theShirt1 = new Shirt('R', "Outdoors shirt", 39.99);
        System.out.println("Color Code is: '" + theShirt1.getColorCode() + "', shirt type '"
                + theShirt1.getDescription() + "', price is: 'R" + theShirt1.getPrice() + "'.");

        Shirt theShirt2 = new Shirt('Z', "Swim shirt", 29.99);
        System.out.println("Color Code is: '" + theShirt2.getColorCode() + "', shirt type '"
                + theShirt2.getDescription() + "', price is: 'R" + theShirt2.getPrice() + "'.");

        Shirt theShirt3 = new Shirt('B', "Office shirt", 19.99);
        System.out.println("Color Code is: '" + theShirt3.getColorCode() + "', shirt type '"
                + theShirt3.getDescription() + "', price is: 'R" + theShirt3.getPrice() + "'.");

//        char colorCode;
//        // Set a valid colorCode
//        theShirt.setColorCode('R');
//        colorCode = theShirt.getColorCode();
//        System.out.println("Color Code: " + colorCode);
//// Set an invalid color code
//        theShirt.setColorCode('Z');
//        colorCode = theShirt.getColorCode();
//        System.out.println("Color Code: " + colorCode);
    }
}
