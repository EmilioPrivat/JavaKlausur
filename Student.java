import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Faculty faculty;
    private int semester;
    private List<Courses> courses;
    private List<Courses> passedCourses;

    public Student(String name, Faculty faculty, int semester) {
        this.name = name;
        this.faculty = faculty;
        this.semester = semester;
        this.courses = new ArrayList<>();
        this.passedCourses = new ArrayList<>();
        this.faculty.addStudent(this);
        Logger.logInfo("Student " + name + " created and added to faculty " + faculty.getFacultyName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCurrentYear() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<Courses> getEnrolledCourses() {
        return courses;
    }

    public void enrollInCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            Logger.logInfo("Student " + name + " enrolled in course " + course.getCourseName());
        } else {
            Logger.logError("Student " + name + " is already enrolled in course " + course.getCourseName());
        }
    }

    public void changeFaculty(Faculty newFaculty) {
        if (this.faculty != null) {
            this.faculty.removeStudent(this);
        }

        this.faculty = newFaculty;
        if (newFaculty != null) {
            newFaculty.addStudent(this);
        }

        this.semester = 0;
        this.passedCourses.clear();
        Logger.logInfo("Student " + name + "'s semester reset to 0 and passed courses cleared");
    }

    public void coursePassed(Courses course) {
        if (!passedCourses.contains(course)) {
            passedCourses.add(course);
            Logger.logInfo("Student " + name + " passed course " + course.getCourseName());
        } else {
            Logger.logError("Student " + name + " has already passed course " + course.getCourseName());
        }
    }

    public void showCoursesInSemester(int semester) {
        Logger.logInfo("Courses enrolled by " + name + " in semester " + semester + ":");
        boolean foundMatchingCourse = false;
        for (Courses course : courses) {
            if (course.getSemester() == semester) {
                System.out.println(course.getCourseName());
                foundMatchingCourse = true;
            }
        }
        if(!foundMatchingCourse){
            Logger.logError("The student " + name + " has not enrolled for any courses in semester " + semester);
        }
    }

    public void showCourseAndFaculty(int semester) {
        Logger.logInfo("Courses enrolled by " + name + " in semester " + semester + ":");

        boolean foundMatchingCourse = false;
        for (Courses course : courses) {
            if (course.getSemester() == semester) {
                Faculty faculty = course.getFaculty();
                Logger.logInfo("Course: " + course.getCourseName() + ", Faculty: " + faculty.getFacultyName());
                foundMatchingCourse = true;
            }
        }

        if (!foundMatchingCourse) {
            Logger.logError("The Student " + name + " is not in any courses in semester: " + semester);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
