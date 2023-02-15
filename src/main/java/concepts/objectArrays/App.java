package concepts.objectArrays;

public class App {
    public static void main(String[] args) {
        Student[] students = {
            new Student(001, "Alexis", "Abner", 100),
            new Student(002, "Cory", "Roberts", 98),
            new Student(003, "Caleb", "Willis", 99),
            new Student(004, "Shae", "Peterson", 88)
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}