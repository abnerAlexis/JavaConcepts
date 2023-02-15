package concepts.encapsulation.student;

public class App {

    public static void main(String[] args) {
        StudentManager sm = StudentManager.getInstance();
        sm.displayNumberOfStudents();

        sm.addStudent("Alexis", "Abner");
        sm.addStudent("Leo", "Abner");
        sm.addStudent("Beren", "Abner");

        sm.displayNumberOfStudents();

        sm.printAllStudents();

        System.out.println("\nPrint by KeySet");
        sm.printAllByKeySet();

        System.out.println("\nGet individual student");
        System.out.println(sm.getStudentById(1002));
    }
}
