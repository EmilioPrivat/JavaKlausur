import java.util.ArrayList;
import java.util.List;

public class Professors {
    private String name;
    private List<Courses> courses;
    private Faculty faculty;
    

    public Professors(String name, Faculty faculty) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.faculty = faculty;
        Logger.logInfo("Professor " + name + " created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            Logger.logInfo("Course " + course.getCourseName() + " assigned to professor " + name);
        }
        checkCourseCount();
    }

    private void checkCourseCount() {
        if (courses.size() < 2) {
            Logger.logError("Professor " + name + " has less than 2 courses.");
        } else {
            Logger.logInfo("Requirement met: Professor " + name + " is assigned to 2 or more courses.");
        }
    }

    public void showProfessorSchedule() {
        Logger.logInfo("Schedule for Professor " + name + ":");
        for (Courses course : courses) {
            if (course.getDay() != null && course.getTime() >= 0) {
                int hours = course.getTime() / 100;
                int minutes = course.getTime() % 100;
                String formattedTime = String.format("%02d:%02d", hours, minutes);
                Logger.logInfo("Course: " + course.getCourseName() + ", Day: " + course.getDay() + ", Time: " + formattedTime);
            } else {
                Logger.logError("Course: " + course.getCourseName() + " has no assigned day and time.");
            }
        }
    }

    public List<Courses> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}
