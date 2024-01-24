import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Courses> courses;
    private List<Student> students;
    private List<Professors> professors;

    public Faculty(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        Logger.logInfo("Faculty " + name + " created.");
    }

    public void setFacultyName(String name) {
        this.name = name;
    }

    public String getFacultyName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
        Logger.logInfo("Student " + student.getName() + " added to faculty " + name);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        Logger.logInfo("Student " + student.getName() + " removed from faculty " + name);
    }

    public void addProfessors(Professors professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
            Logger.logInfo("Professor " + professor.getName() + " added to faculty " + name);
        }
    }

    public List<Professors> getProfessors() {
        return professors;
    }

    public void addCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setCourseFaculty(this);
            Logger.logInfo("Course " + course.getCourseName() + " added to faculty " + name);
        }
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public List<Courses> getCoursesInSemester(int semester) {
        List<Courses> coursesInSemester = new ArrayList<>();
        for (Courses course : courses) {
            if (course.getSemester() == semester) {
                coursesInSemester.add(course);
            }
        }
        return coursesInSemester;
    }

    public void anzeigenAlleStudierenden() {
        Logger.logInfo("Studierende in Fakultät " + name + ":");
        boolean yesStudents = false;
        for (Student student : students) {
            if (student.getFaculty().equals(this)) {
                System.out.println("Student: " + student.getName());
                yesStudents = true;
            }
        }
        if(!yesStudents){
            Logger.logError("There are no students in faculty: " + name);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
