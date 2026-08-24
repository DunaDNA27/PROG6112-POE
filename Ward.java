/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalbedmanager;

/**
 *
 * @author oarat
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ward 
{
   private ArrayList<Inpatient> beds;
   static Scanner input = new Scanner(System.in);
   private final int rows = 4;
   private final int cols = 5;
   private final int capacity = rows * cols;
   
   //Constructor to intialise system with 20 beds
   public Ward()
   {
       beds = new ArrayList<>(capacity);
       for (int i = 0; i < capacity; i++)
       {
           beds.add(null);
       }
   }
   
   //Register Patient
   public static void registerPatient(String patientID, String firstName, String lastName, int age, String gender, String condition, String patientCategory)
   {
       System.out.print("Enter Patient ID: ");
       patientID  = input.nextLine();
       
       System.out.print("Enter First Name: ");
       firstName = input.nextLine();
       
       System.out.print("Enter Last Name: ");
       lastName = input.nextLine();
       
       System.out.print("Enter Age: ");
       age = input.nextInt();
       
       System.out.print("Enter Gender: ");
       gender =  input.nextLine();
       
       System.out.print("Enter Condition: ");
       condition = input.nextLine();
   }
   
   public void searchPatient(String patientID)
   {
       for (Inpatient p : beds)
       {
           if (p != null && p.getPatientId().equals(patientID))
           {
               System.out.println("\n--- Patient Found ---");
               p.displayInfo();
               return;
           }
       }
       System.out.println("Patient not found.");
   }
   
   public boolean updatePatient(String patientID, String newCondition)
   {
       for (Inpatient p : beds)
       {
           if (p != null && p.getPatientId().equals(patientID))
           {
               p.setCondition(newCondition);
               System.out.println("Updated Condition for " + p.getFirstName());
               return true;
           }
       }
       System.out.println("Patient not found.");
       return false;
   }  
   
    //Release a Bed
    public boolean releaseBed(String patientID)
    {
        for (int i = 0; i < capacity; i++)
        {
            Inpatient p = beds.get(i);
            if (p != null && p.getPatientId().equals(patientID))
            {
                beds.set(i, null);
                System.out.println("Released bed " + " from patient " + p.getFirstName());
                return true;               
            }
        }
        System.out.println("Patient ID not found.");
        return true;
    }
    
    //Display complete 4x5 ward layout 
    public void displayWardLayout()
    {
        System.out.println("\n--- Ward Layout ---");
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
            {
                int idx = r * cols + c;
                if (beds.get(idx) == null) 
                {
                    System.out.println("[Empty]\t");           
                }
                
                else 
                {
                   System.out.println("[Occupied by " + beds.get(idx).getFirstName() + "]\t");
                }
            }
            System.out.println();
        }
    }
    
    //Display available and occupied beds separately
    public void displayBedStatus()
    {
        System.out.println("\n--- Bed Status ---");
        System.out.println("Available Beds:");
        for (int i = 0; i < capacity; i++)
        {
            if (beds.get(i) == null) 
            {
                System.out.println("Bed " + (i + 1));
            }
        }
        
        System.out.println("\nOccupied Beds:");
        for (int i = 0; i < capacity; i++)
        {
            if (beds.get(i) != null)
            {
                System.out.println("Bed " + (i+1) + "->" + beds.get(i).getFirstName());
            }
        }
    }
    
    //Count availible beds
    public int countAvailableBeds()
    {
        int count = 0;
        for (Inpatient bed : beds)
        {
            if (bed == null)
            {
                count++;
            }
        }
        return count;
    } 
}
