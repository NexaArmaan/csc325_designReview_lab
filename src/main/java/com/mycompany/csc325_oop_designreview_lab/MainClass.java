/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.*;
/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // ToDo 5: Fix the error
	 Freshman std1= new Freshman("James", (short) 20, 12); // name, age, credits
	 Senior std2 = new Senior("John", (short) 30, 90);

	 // ToDo 12: Set the gpa of the student using the scanner and user
	 // 			input and then print the output.
	 Scanner sc = new Scanner(System.in);	//Scanner input initializing

	 System.out.print("Enter GPA for freshman: ");	//Freshman Class GPA input
	 float gpa1 = sc.nextFloat();
	 std1.setGpa(gpa1);

	 System.out.print("Enter GPA for freshman: ");	//GPA Class GPA input
	 float gpa2 = sc.nextFloat();
	 std2.setGpa(gpa2);

	 System.out.println(std1);	//calls the toString for Freshman Class
	 System.out.println(std2);	//calls the toString for Senior Class

	 // ToDo 13: add comments and explain your code
	 /* This program is used to explain Inheritance using different classes,
	 	It also uses abstraction with Human being an abstract class,
	 	Polymorphism using the overriding of toString() method,
	 	and Encapsulation with some getter and setter methods of private variables

	 	The program takes two inputs of GPA for Freshman and Senior year and
	 	displays the details.
	  */
	}

}

