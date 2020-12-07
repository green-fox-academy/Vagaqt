package ThisLittleExercise;

import java.util.ArrayList;
import java.util.List;

//Create a Cohort class that has the following
//
//        fields:
//        name: the name of the cohort
//        students: a list of Students
//        mentors: a list of Mentors
//        methods:
//        addStudent(Student): adds the given Student to students list
//        addMentor(Mentor): adds the given Mentor to mentors list
//        info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
//        The Cohort class has the following constructors:
//
//        Cohort(name): beside the given parameter, it sets students and mentors as empty lists
public class Cohort {
    String name;
    List<Mentor> mentors = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
