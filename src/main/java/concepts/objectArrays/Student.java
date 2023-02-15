package concepts.objectArrays;

public class Student {
    int stdNumber;
    String name;
    String lastname;
    int marks;

    public Student(int stdNumber, String name, String lastname, int marks) {
        this.stdNumber = stdNumber;
        this.name = name;
        this.lastname = lastname;
        this.marks = marks;
    }

    public String toString() {
        return stdNumber + " " + name + " " + lastname + " : " + marks;
    }
}
