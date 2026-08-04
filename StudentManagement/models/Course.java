package models;

/**
 * Represents a course with a course code and title.
 */
 
public class Course {
    private String code;
    private String title;

    /**
     * Creates a Course object.
     *
     * @param code the course code
     * @param title the course title
     */
    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
     * Returns the course code.
     *
     * @return the course code
     */
    public String getCode() {
		return code;
	}

    /**
     * Returns the course title.
     *
     * @return the course title
     */
	public String getTitle() {
		return title;
	}

    /**
     * Returns the course details as a formatted string.
     *
     * @return formatted course information
     */
	public String toString() {
		return ("Course Code: " + code + "\tCourse Title: " + title);
	}
	
}