public class Faculty {

    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void setFacultyName(String name) {
        this.name = name;
    }

    public String getFacultyName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
     }
}
