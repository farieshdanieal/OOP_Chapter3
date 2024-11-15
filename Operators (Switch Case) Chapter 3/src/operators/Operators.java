/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operators;



/**
 *
 * @author User
 */
import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //object named reader

        // Prompt user to enter two integers
        System.out.print("Enter the first integer: "); // User input here
        int num1 = reader.nextInt(); // Scanner read user input
        System.out.print("Enter the second integer: "); // User input here
        int num2 = reader.nextInt(); // Scanner read user input
        
        // Display Menu Choice
        reader.nextLine(); // Clear buffer to read next line
        System.out.println("");// Create space for lines
        System.out.println("Operators:-"); // This is the title for the menu
        System.out.println("1. Addition"); // Menu 1
        System.out.println("2. Substraction"); // Menu 2
        System.out.println("3. Multiplication"); // Menu 3
        System.out.println("4. Division"); // Menu 4
        System.out.println(""); // To create space for lines
        
        System.out.print("Enter Your Operation (1, 2, 3, 4): "); // Program will ask for user input to perform operation
        int choice = reader.nextInt(); //Scanner read user input in integer
        
        //Create Formulas for operators
        int sum = num1 + num2; // Formula for addition
        int difference = num1 - num2; // Formula for substraction
        int product = num1 * num2; // Formula for multiplication
        double remainder = (double)num1 / num2; // Formula for division
        
        
        //Perform operation based on user choice
        switch(choice){
            case 1: System.out.println("Addition: "+sum); break; // Display results for addition and exit after 'break'
            case 2: System.out.println("Substraction: "+difference); break; // Display results for substraction and exit after 'break'
            case 3: System.out.println("Multiplication: "+product); break; // Display results for multiplication and exit after 'break'
            case 4: System.out.printf("Division: %.4f\n", remainder); break; // Display results for division and exit after 'break'
            default: System.out.println("Invalid Input"); break; // Any input that is not 1 - 4 will display Invalid Input
        }       
 
    }
    
}
