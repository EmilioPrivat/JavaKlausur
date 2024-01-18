public class Courses {
    private String name;
    private Faculty faculty;
    private Professors professors;

    public Courses(String name, Faculty faculty, Professors professors) {
        this.name = name;
        this.faculty = faculty;
        this.professors = professors;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return name;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setCourseProfessors(Professors professors) {

        this.professors = professors;

    }

    @Override
    public String toString() {
        return name;
     }
}
