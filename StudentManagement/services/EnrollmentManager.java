package services;

import models.Student;

/**
 * Manages student related operations such as searching and sorting.
 */

public class EnrollmentManager {

    /**
     * Creates an EnrollmentManager object.
     */
    public EnrollmentManager() {

    }
    /**
     * Searches for a student using the student ID.
     *
     * @param students the array containing student objects
     * @param count the number of students currently stored
     * @param id the student ID to search for
     * @return the matching student if found; otherwise null
     */
    public Student searchStudentById(Student[] students, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return students[i];
            }
        }
        return null;
    }

    /**
     * Sorts students alphabetically by name using Bubble Sort.
     *
     * @param students the array of students
     * @param count the number of students currently stored
     */
    public void sortStudentsByName(Student[] students, int count) {

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
