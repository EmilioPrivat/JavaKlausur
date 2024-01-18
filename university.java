import java.util.ArrayList;
import java.util.List;

public class university {

    static List<Professors> professors = new ArrayList<>();
    static List<Courses> courses = new ArrayList<>();
    static List<Faculty> faculties = new ArrayList<>();

    public static void test(){

       Professors Emilio = new Professors("Emilio");
       professors.add(Emilio);
       System.out.println("Succesfully added professor " + professors);

       Professors Malte = new Professors("Malte");
       professors.add(Malte);
       System.out.println("Succesfully added professor " + professors);

       Faculty Mathematik = new Faculty("Mathematik");
       faculties.add(Mathematik);
       System.out.println("Succesfully added faculty " + faculties);

       Courses Mathe = new Courses("Mathe", Mathematik, Malte);
       courses.add(Mathe);
       System.out.println("Succesfully added Course " + courses);


       System.out.println(Mathe);

    }

    public static void main(String[] args) {
        university University = new university();
        university.test();
    }

}