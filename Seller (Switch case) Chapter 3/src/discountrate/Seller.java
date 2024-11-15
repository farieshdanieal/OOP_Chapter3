/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountrate;

/**
 *
 * @author User
 */





import java.util.Scanner;

public class Seller {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Create scanner object

        // Declare variables
        int menu; // For switch case
        int quantity;
        float price = 0; // As a placeholder for value
        float totalPrice;
        String itemName; // Initialize itemName

        // Create a display menu
        System.out.println("------------------------------------");
        System.out.println("|     Welcome to Pak Mat Burger     |");
        System.out.println("------------------------------------");
        System.out.println("|         List of beverages         |");
        System.out.println("|   1. Chicken Burger : RM 5.00     |");
        System.out.println("|   2. Beef Burger    : RM 6.00     |");
        System.out.println("|   3. Cheese Burger  : RM 6.50     |");
        System.out.println("_____________________________________");
        System.out.println("");

        System.out.print("Insert code of your desired menu: "); // User input here
        menu = reader.nextInt(); // Scanner read input

        // Determine price and item name based on menu choice
        switch (menu) {
            case 1:
                price = 5.00f; // price for case 1
                itemName = "Chicken Burger";
                break; // Exit Switch
            case 2:
                price = 6.00f; // price for case 2
                itemName = "Beef Burger";
                break; // Exit Switch
            case 3:
                price = 6.50f; // price for case 3
                itemName = "Cheese Burger";
                break; // Exit Switch
            default: // Any input that is not 1 - 3 will display this command
                System.out.println("Invalid menu item.");
                reader.close(); // Close the scanner
                return; // Exit the method
        }

        System.out.print("Insert Quantity: "); // User input here
        quantity = reader.nextInt(); // Scanner read input

        totalPrice = price * quantity; // Calculate total price

        // Display item information
        System.out.println("\n######## Item Information ########");
        System.out.println("Item Name: " + itemName); // Will display item name
        System.out.printf("Price per Item: RM %.2f%n", price); // Will display price formatted
        System.out.println("Quantity: " + quantity); // Will display quantity
        System.out.printf("Total Price: RM %.2f%n", totalPrice); // Will display total price formatted

        reader.close(); // Close the scanner
    }
}
