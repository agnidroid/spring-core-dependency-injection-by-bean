package in.stackroute.model;

import java.util.Set;

public class Course {
    private int courseId;
    private String courseName;
    private Professor professor;
    private Set<Student> students;

    public Course() {
        System.out.println("Course Constructor");
    }

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor is set");
        System.out.printf("Professor details: professorId=%s, professorName=%s",
                professor.getProfessorId(),professor.getProfessorName());
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
