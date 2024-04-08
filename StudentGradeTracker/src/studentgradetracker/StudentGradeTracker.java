/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradetracker;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author okker
 */
public class StudentGradeTracker {
    // Defining ArrayLists to store student names and grades
    public ArrayList<String> studentNames = new ArrayList<>();
    public ArrayList<Integer> studentGrades = new ArrayList<>();
    //global scanner 
    Scanner input  = new Scanner(System.in);
    

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Grade Tracker!");
        System.out.println();
        System.out.println("what would you like to do?");
        choice(); // calling the options method  
                
    }
     /**
   * This method displays the menu and handles user choices.
   */
    public static void choice() {
        StudentGradeTracker Grades = new StudentGradeTracker();
        Scanner input = new Scanner(System.in);
        int userChoice;
       do {System.out.println("1. Add a new student and grade\n" +
                           "2. Display list of students and their grades\n" +
                           "3. Calculate average grade for the subject\n" +
                           "4. Search for a student and display their grade\n" +
                           "5. Exit");
       System.out.println("");
       System.out.print("Enter your choice: ");
        userChoice = input.nextInt();
        input.nextLine();
        
        
        switch (userChoice) {
            case 1:
                // adds the users name and grade
                Grades.addStudent();
                System.out.println("");
                break;
            case 2:
                // fetches the students names and there grades
                Grades.displayStudent();
                System.out.println("");
                break;
            case 3:
                // Gets the method that calculates the averages
               Grades.averageGrade();
               System.out.println("");
                break;
            case 4:
                // Searches the array and displays information
                Grades.searchStudent();
                System.out.println("");
                break;
            case 5:
                // when the user is finished 
                System.out.println("Exiting the programm. Thank you!");
                break;
            default:
                System.out.println("Invalid option. Please choose a number between 1 and 5.");
                break;
        }
       } while (userChoice != 5);
     }
      /**
   * This method prompts the user for student information and adds it to the ArrayLists.
   */
     public void addStudent(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentName = input.next();
        System.out.print("Enter " + studentName + "'s grade: ");
        int grade = input.nextInt();
        if (grade > 100) {
            System.err.println("Cant be more then a 100");
        }
        input.nextLine(); // Consume the newline
        
        studentNames.add(studentName); //adding the input to array for names
        studentGrades.add(grade); //addding grade to array for grades
        System.out.println(studentName + "'s grade has been added successfully.");
 
     }
    /**
   * This method displays the list of students and their grades stored in the ArrayLists.
   */
     public void displayStudent() {
        System.out.println("List of students and their grades:");
         if (studentNames.isEmpty()) {
        System.err.println("No student info available");
     } else {
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + " - " + studentGrades.get(i));
        }
       }
     }
     /**
   * This method calculates the average of the grades.
   */
     public void averageGrade() {
         int sum = 0;
         for (int i : studentGrades) {
             sum += i;
         }
         var total = studentGrades.size();
         int avg = sum/total;
         System.out.println("Average grade for the subject: " + avg);
         
     }
     /**
   * This method searches through array based on given name and displays name and grade.
   */
    public void searchStudent() {
        System.out.print("Enter students name: ");
        String name = input.nextLine(); // Use nextLine to allow for names with spaces

        boolean found = false;
        for (int i = 0; i < studentNames.size(); i++) {
            if (studentNames.get(i).equalsIgnoreCase(name)) {
                System.out.println( studentNames.get(i) + "'s grade: " + studentGrades.get(i));
                found = true;
                break;
            }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        
    }
     
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//