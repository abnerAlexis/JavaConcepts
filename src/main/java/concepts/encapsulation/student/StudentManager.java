package concepts.encapsulation.student;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private static int counter = 10000;
    private static final Map<Integer, Student> students = new HashMap<>();
    private static StudentManager studentManager;

    private StudentManager() {}

    public static StudentManager getInstance() {
        if (studentManager == null) {
            studentManager = new StudentManager();
        }
        return studentManager;
    }

    public void addStudent(String firstName, String lastName) {
        students.put(++counter, new Student(firstName, lastName, counter));
    }

    public Student getStudentById(int studentId) {
        return students.get(studentId);
    }

    public void displayNumberOfStudents() {
        System.out.println("There are " + students.size() + " students.");
    }

    public void printAllStudents() {
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    public void printAllByKeySet() {
        for (Integer studentId : students.keySet()) {
            System.out.println(studentId + " => " + getStudentById(studentId));
        }
    }
}
