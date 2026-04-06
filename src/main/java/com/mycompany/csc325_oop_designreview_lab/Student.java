/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */

// ToDo 1: Make this class a child of Human
public class Student extends Human{
    //Required variable
    private String address;
    private float gpa;
    private int credits;

    // ToDo 2: Fix the resulting errors
    // ToDo 6: Fix the constructor of the Student class
    //Constructor
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    //Address getter method
    @Override
    public String getAddress() {
        return address;
    }

    //Address Setter method
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter
    // ToDo 4: Add comments to your code

    //GPA getter method
    public float getGpa() {
        return gpa;
    }

    //GPA setter method
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    // ToDo 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Student Name: " + getName() +
                ", Age: " + getAge() +
                ", Credits: " + credits +
                ", GPA: " + gpa;
    }
}
