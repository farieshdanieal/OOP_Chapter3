/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountrate;

/**
 *
 * @author User
 */


import java.util.Scanner; //Put Library

public class DiscountRate {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Create an object for scanner named reader
        
        
        System.out.print("Enter the item name: "); //User insert Item Name
        String itemName = reader.nextLine(); //Scanner will read input
        
        System.out.print("Enter the price of the item (RM): "); //User insert Item Price
        float price = reader.nextFloat(); //Scanner will read input
        
        System.out.print("Enter the quantity of the item: "); //User insert item quantity
        int quantity = reader.nextInt(); //Scanner will read input
        

        reader.nextLine(); // Remove buffer to read next linenew Scanner(system
        
        // Display color code option
        System.out.println("Discount Color Code:"); // This is the header for the Menus
        System.out.println("1. Red (10%)"); // Option 1
        System.out.println("2. Green (15%)"); // Option 2
        System.out.println("3. Blue (25%)"); // Option 3
        System.out.println("4. Yellow (30%)"); //Option 4
        System.out.print("Enter Your Color Code (1, 2, 3, 4): "); //Program will pro,pt the user to insert input
        int choice = reader.nextInt();
        
        float discountRate = 0; //Need to initialize the discount rate as a placeholder 
        
        // User will insert case 1,2,3,4
        switch (choice) {
            case 1:
                discountRate = (float) 0.10f; // 10% discount rate
                break; // Exit Switch
            case 2:
                discountRate = (float) 0.15f; // 15% discount rate
                break; // Exit Switch
            case 3:
                discountRate = (float) 0.25f; // 25% discount rate
                break; // Exit Switch
            case 4:
                discountRate = (float) 0.30f; // 30% discount rate
                break; // Exit Switch
            default:
                System.out.println("Invalid Input"); break; // Any input that are not 1 - 4 
                                                            // will display invalid input and
                                                            // Exit Switch
        }
        
        // Formula for discount
        float totalPrice = price * quantity; 
        float discountAmount = discountRate * totalPrice;
        float finalprice = totalPrice - discountAmount;
        
        // Display the results
        System.out.println("\n########Item Information########"); // This is a header for the output
        System.out.println("Item Name: " + itemName); // Will display inserted String
        System.out.println("Price per Item: RM " + price); // Will display inserted integer
        System.out.println("Quantity: " + quantity); // Will display inserted integer
        System.out.println("Total Price: RM " + totalPrice); // Calculated by formula
        System.out.println("Discount Rate %: " + (int)(discountRate * 100)); // Multiply by 100 and use "int" to display the discount in whole number 
        System.out.printf("Price After Discount: RM %.2f%n", finalprice);

        
        reader.close(); //Close the scanner
    }
}

