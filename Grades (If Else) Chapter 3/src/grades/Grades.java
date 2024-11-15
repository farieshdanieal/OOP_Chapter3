/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grades;

/**
 *
 * @author User
 */


import java.util.Scanner; // Put library
public class Grades {

    public static void main(String[] args) {
        
    int Ngrade; //for numbered grade
    
    Scanner reader = new Scanner(System.in); //object named as reader
    System.out.print("Enter Your Marks: "); //User will insert input from here
    Ngrade = reader.nextInt(); //scanner will scan user 
    
    
    //Create scenarios for grades
    if (Ngrade < 0 || Ngrade > 100) { //Put range for user input between 0 to 100
            System.out.println("Invalid input."); //This message will display if the user put 
                                                  //anything that is beside the requirement
    } else  { /*After we created the condition in "if" statement create an "else" 
               statement to create the scenarios for the grades*/                                    
        if (Ngrade >= 85){ //Use else if for more than 1 "if else" statement
        System.out.println("Your Grade is: A");} //This prompt will display Grsde A-
    else if (Ngrade >= 80){ //Use else if for more than 1 "if else" statement
        System.out.println("Your Grade is: A-");} //This prompt will display Grsde A-
    else if (Ngrade >= 75){
        System.out.println("Your Grade is: B+");} //This prompt will display Grsde B+
    else if (Ngrade >= 70){
        System.out.println("Your Grade is: B");} //This prompt will display Grsde B
    else if (Ngrade >= 65){
        System.out.println("Your Grade is: B-");} //This prompt will display Grsde B-
    else if (Ngrade >= 60){
        System.out.println("Your Grade is: C+");} //This prompt will display Grsde C+
    else if (Ngrade >= 55){
        System.out.println("Your Grade is: C");} //This prompt will display Grsde C
    else if (Ngrade >= 50){
        System.out.println("Your Grade is: C-");} //This prompt will display Grsde C-
    else { // Use else for the last scenarios
        System.out.println("Your Grade is: F");} //This prompt will display Grsde F
    }
}
}   
    
    

