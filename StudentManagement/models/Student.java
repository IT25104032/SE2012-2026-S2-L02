package models;

/**
 * Represents a student with a student ID and name.
 */
 
public class Student {
	private String id;
	private String name;

    /**
     * Creates a Student object.
     *
     * @param id the student's ID
     * @param name the student's name
     */

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Returns the student ID.
     *
     * @return the student ID
     */
    	public String getId() {
		return id;
	}

    /**
     * Returns the student name.
     *
     * @return the student name
     */
	public String getName() {
		return name;
	}

    /**
     * Returns the student's details as a formatted string.
     *
     * @return formatted student information
     */
	public String toString() {
		return ("Student ID: " + id + "\tStudent Name: " + name);
	}
	
}