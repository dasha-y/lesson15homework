import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int course;
    private int group;
    private int markMath;
    private int markHistory;
    private int markGeography;


    public Student(String name, int course, int group, int markMath, int markHistory, int markGeography) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.markMath = markMath;
        this.markHistory = markHistory;
        this.markGeography = markGeography;
    }

    public static void numberCourse(List<Student> students){
        for (Student st: students){
            if(st.GPA()<3){
                students.remove(st);
            } else{
                st.course = st.course+1;
            }
        }
    }

    public int GPA(){
        int gpa = (this.markMath + this.markHistory + this.markGeography)/3;
        return gpa;
    }
    public static void printStudent(List<Student> students, int course) {
        for (Student st : students) {
            if (st.course == course) {
                System.out.println("На этом курсе обучаются: " + st.name);
            }
        }
    }
}
