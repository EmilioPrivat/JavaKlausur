import java.time.DayOfWeek;
import java.time.LocalTime;

public class Courses {
    private String name;
    private Faculty faculty;
    private Professors professors;
    private boolean passed;
    private int semester;
    private int time;
    private String day;
   

    public Courses(String name, int semester) {
        this.name = name;
        this.semester = semester;
        this.faculty = faculty;

        Logger.logInfo("Course " + name + " created in semester " + semester);
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return name;
    }

    public void setDay(String day) {
        String[] validDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        if (isValidDay(day, validDays)) {
            this.day = day;
            Logger.logInfo("Set day of " + name + " to: " + day);
        } else {
            Logger.logError("Invalid day. Please choose a day between Monday and Friday.");
        }
    }
    
    private boolean isValidDay(String day, String[] validDays) {
        for (String validDay : validDays) {
            if (validDay.equalsIgnoreCase(day)) {
                return true;
            }
        }
        return false;
    }

    public String getDay(){
        return day;
    }

    public void setTime(int time) {
        this.time = time;
        int hours = time / 100;
        int minutes = time % 100;
        String formattedTime = String.format("%02d:%02d", hours, minutes);
        Logger.logInfo("Set time of " + name + " to: " + formattedTime);
    }
    

    public int getTime() {
        return time;
    }
  

    public boolean passed() {
        return passed;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void setCourseFaculty(Faculty faculty) {
        this.faculty = faculty;
        Logger.logInfo("Course " + name + " assigned to faculty " + faculty.getFacultyName());
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setCourseProfessors(Professors professors) {
        this.professors = professors;
        Logger.logInfo("Course " + name + " assigned to professor " + professors.getName());
    }

    public Professors getCourseProfessors() {
        return professors;
    }

    @Override
    public String toString() {
        return name;
    }
}
