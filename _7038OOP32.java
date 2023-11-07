import java.util.ArrayList;

public class _7038OOP32 {
    private int student_id;
    private String student_name;
    private ArrayList<String> grades;

    public _7038OOP32(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(student_name);
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }
}

class st {

    public static void main(String[] args) {
        _7038OOP32 j = new _7038OOP32(7038, "Yaman");
       System.out.println(j.getGrades());
       System.out.println(j.getStudent_id());
       System.out.println(j.getStudent_name());
    }
}