import java.util.ArrayList;
import java.util.List;


public class Professors {
    String name;
    List<Courses> courses;
    

    public Professors(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
     }
    }

