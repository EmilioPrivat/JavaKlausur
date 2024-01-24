import java.util.ArrayList;
import java.util.List;

public class University {

    static List<Professors> professors = new ArrayList<>();
    static List<Courses> courses = new ArrayList<>();
    static List<Faculty> faculties = new ArrayList<>();
    static List<Student> students = new ArrayList<>();

    public static void test() {

        Faculty Informatik = new Faculty("Informatik");
        Faculty Elektrotechnick = new Faculty("Elektrotechnik");
        Faculty Wirtschaftswissenschaften = new Faculty("Wirtschaftswissenschaften");
        Faculty Medizin = new Faculty("Medizin");
        Faculty Naturwissenschaften = new Faculty("Naturwissenschaften");

        Student Emilio = new Student("Emilio", Informatik, 1);
        Student Duane = new Student("Duane", Informatik, 1);
        Student Kerem = new Student("Kerem", Medizin, 1);
        Student Florian = new Student("Florian", Medizin, 1);

        Professors Malte = new Professors("Malte", Informatik);
        Professors Lisa = new Professors("Lisa", Naturwissenschaften);

        Courses EinfuehrungInDieInformatik = new Courses("Einfuehrung in die Informatik", 1);
        Courses DesginThinking = new Courses("Design Thinking", 5);
        Courses Java = new Courses("Java", 1);
        Courses RequirementEngeneering = new Courses("Requirement Engeneering", 3);

        Informatik.addCourse(EinfuehrungInDieInformatik);
        Informatik.addCourse(DesginThinking);
        Informatik.addCourse(Java);

        Malte.addCourse(Java);
        Malte.addCourse(EinfuehrungInDieInformatik);

        Lisa.addCourse(DesginThinking);
        Lisa.addCourse(RequirementEngeneering);

        Emilio.enrollInCourse(RequirementEngeneering);
        Emilio.enrollInCourse(Java);

        Duane.enrollInCourse(DesginThinking);
        Duane.enrollInCourse(EinfuehrungInDieInformatik);

        Emilio.showCoursesInSemester(7);
        Duane.showCoursesInSemester(5);

        EinfuehrungInDieInformatik.setTime(1230);
        EinfuehrungInDieInformatik.setDay("Tuesday");

        Java.setTime(900);
        Java.setDay("Monday");

        Malte.showProfessorSchedule();

        System.out.println(Malte.getCourses());
        System.out.println(Lisa.getCourses());

        Informatik.anzeigenAlleStudierenden();
        Medizin.anzeigenAlleStudierenden();
        Naturwissenschaften.anzeigenAlleStudierenden();

        Emilio.showCourseAndFaculty(7);

        Emilio.changeFaculty(Naturwissenschaften);

    }

    public static void main(String[] args) {
        University University = new University();
        University.test();
    }

}