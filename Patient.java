package com.mycompany.hospitalbedmanager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oarat
 */

//Patient Superclass
public class Patient 
{
    private String patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String condition;
    private String patientCategory;
    
    public Patient(String patientID, String firstName, String lastName, int age, String gender, String condition, String patientCategory)
    {
       this.patientID = patientID;
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.gender = gender;
       this.condition = condition;
       this.patientCategory = patientCategory;
    }
    
    // Getters
    public String getPatientId()
    { return patientID; }
    
    public String getFirstName() 
    { return firstName; }
    
    public String getLastName() 
    { return lastName; }
    
    public int getAge() 
    { return age; }
    
    public String getGender() 
    { return gender; }
    
    public String getCondition() 
    { return condition; }
    
    public String getPatientCategory()
    { return patientCategory; }
    
    //Setter
    public void setCondition(String condition) 
    { this.condition = condition; }
    
    public void displayInfo()
    {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " +firstName +" " + lastName);
        System.out.println("Age: "+ age);
        System.out.println("Gender: " + gender);
        System.out.println("Condition: " + condition);
        System.out.println("Category: " + patientCategory);
    }
}

// Subclass for Inpatients
class Inpatient extends Patient 
{
    private String bedNum;
    
    public Inpatient(String patientID, String firstName, String lastName, int age, String gender, String condition, String patientCategory)
    {
        super(patientID, firstName, lastName, age, gender, condition, patientCategory);
        this.bedNum = bedNum;
    }
    
    public void displayInfo()
    {   
        super.displayInfo();
        System.out.println("Bed: " + bedNum);       
    }
}
