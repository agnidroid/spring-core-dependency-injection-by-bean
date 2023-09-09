package in.stackroute.model;

public class Professor {
    private String professorId;
    private String professorName;
    private Course course;

    public Professor() {
        System.out.println("Professor Constructor");
    }

    public Professor(String professorId, String professorName) {
        this.professorId = professorId;
        this.professorName = professorName;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
