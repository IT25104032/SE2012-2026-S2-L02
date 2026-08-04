package mainapp;

import models.Student;
import services.EnrollmentManager;

import java.util.Scanner;


/**
 * Runs the Student Management System.
 * Handles user interaction through a menu-driven interface.
 */
 
public class Main {

    /**
     * Starts the Student Management System.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] students = new Student[100];
		int studentCount = 0;

		EnrollmentManager manager = new EnrollmentManager();
		
		int option;
		
		do {
			System.out.println("MAIN MENU");
			System.out.println("1. Enroll student");
			System.out.println("2. List students");
			System.out.println("3. Search student");
			System.out.println("4. Sort students");
			System.out.println("5. Exit");
			
			System.out.print("Enter your choice: ");
			option = input.nextInt();
			input.nextLine();
			
			switch(option) {
				case 1:
					if (studentCount < 100) {
						System.out.print("Enter student's name: ");
						String name = input.nextLine();
						System.out.print("Enter student ID: ");
						String id = input.nextLine();
						students[studentCount] = new Student(id, name);
						studentCount++;
						System.out.println("Student enrolled successfully");
					}else {
						System.out.println("Can't enroll more students");
					}
					break;
					
				case 2:
					if (studentCount == 0) {
						System.out.println("No students available");
					}else {
						System.out.println("---- Student details ----");
						for (int i = 0; i < studentCount; i++) {
							System.out.println(students[i]);
						}
					}
					break;
					
				case 3:
					System.out.print("Enter student ID: ");
					String searchID = input.nextLine();
					Student studentval = manager.searchStudentById(students, studentCount, searchID);
					if (studentval == null) {
						System.out.println("Student not found");
					}else {
						System.out.println(studentval);
					}
					break;
				
				case 4:
					manager.sortStudentsByName(students, studentCount);
					System.out.println("Students sorted successfully");
					break;
					
				case 5:
					System.out.println("Exiting...");
					break;
					
				default:
					System.out.println("Invalid option");
					break;
			}
		}while (option != 5);
		
		input.close();
	}
}


