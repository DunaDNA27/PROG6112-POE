/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitalbedmanager;

/**
 *
 * @author oaratwa
 */
import java.util.Scanner;

public class HospitalBedManager 
{
    // Create an Scanner object
    static Scanner input = new Scanner(System.in);
    
    //Ward ward = new Ward();
    
    public static void main(String[] args) 
    {
       Ward ward = new Ward();
       mainMenu();
       
    }
    
    public static void mainMenu()
    {
        while (true)
        {                       
            System.out.println("\n =========================");
            System.out.println("Hosptial Bed Management System");
            System.out.println("   =========================");
            System.out.println("1. Register Patient");
            System.out.println("2. Update existing patient details");
            System.out.println("3. Search Patient");   
            System.out.println("4. Deallocate Bed");
            System.out.println("5. Generate Ward Report");
            System.out.println("6. Exit");
            System.out.print("Please select an option: ");   
            
            int choice = input.nextInt();
            input.nextLine();// clear buffer 
            
            if (choice == 1)
            {
              ward.registerPatient();               
            }
            
            else if (choice == 2)
            {
              ward.updatePatient();
            }
            
            else if (choice == 3)
            {
               ward.searchPatient();  
            }
            
            else if (choice == 4)
            {
               ward.releaseBed();             
            }
            
            else if (choice == 5)
            {
                ward.displayWardLayout();
                ward.displayBedStatus();
            }
            
            else if (choice == 6)
            {
                System.out.println("Goodbye!");//Exits program
                break;
            }
            
            else
            {
                System.out.println("Invalid option; Please try again.");
            }
        }    
    }   
}
