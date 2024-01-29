/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classwork;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class Lesson10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int i = 2;
//        int j = 8;
//        System.out.println((i < 1) && (j > 6));
//        System.out.println((i < 1) || (j > 6));
//        System.out.println(i < 3);
//        System.out.println(!(i < 3));
//        int numberOfGoals = 1;
//        String s = (numberOfGoals == 1 ? "goal" : "goals");
//        System.out.println("I scored " + numberOfGoals + " " + s);
//        numberOfGoals++;
//        s = (numberOfGoals == 1 ? "goal" : "goals");
//        System.out.println("I scored " + numberOfGoals + " " + s);

        int month = 8;
        boolean isLeapYear = false;
        if (month > 12 || month < 1) {
            System.out.println("Invalid month.");
        } else if (month == 2) {
            if (!isLeapYear) {
                System.out.println("28 days in the month.");
            } else {
                System.out.println("29 days in the month.");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days in the month.");
        } else {
            System.out.println("31 days in the month.");

        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in the month.");
                break;
            case 2:
                if (!isLeapYear) {
                    System.out.println("28 days in the month."
                    );
                } else {
                    System.out.println("29 days in the month.");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in the month.");
                break;
            default:
                System.out.println("Invalid month.");
        }
    }

}

class Employees {

    public String name1 = "Fred Smith";
    public String name2 = "fred Smith";

    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }

    public static void main(String[] args) {
        Employees employee = new Employees();
        employee.areNamesEqual();
    }
}
