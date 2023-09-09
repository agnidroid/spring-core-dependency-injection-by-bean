package in.stackroute.model;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private Set<Course> courses = new HashSet<>();


    public Student() {
        System.out.println("Student Constructor");
    }

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }


    // Add a convenience method to add courses
    public void addCourse(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }

    // Remove a student from a course
    public void removeCourse(Course course) {
        courses.remove(course);
        course.getStudents().remove(this);
    }

}






