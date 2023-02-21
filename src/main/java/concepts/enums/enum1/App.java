package concepts.enums.enum1;

public class App {
    public static void main(String[] args) {
        enumInfo();
//        getStatusNordinal();
//        workWithConditions();
//        workWithSwitch();
    }

    private static void enumInfo() {
        Status status = Status.Flying;
        System.out.println("Enums cannot extend another class.\n" +
            "They can have constructors, variables and methods.\n" +
            "Enum Java extends Enum Class by default.\n" + status.getClass().getSuperclass());
    }

    private static void workWithSwitch() {
        Status status = Status.Flying;
        switch (status) {
            case Running -> System.out.println("It's great!");
            case Flying -> System.out.println("Awesome!");
            case Pending -> System.out.println("Patience:)");
            case Success -> System.out.println("Yay!");
        }
    }

    private static void workWithConditions() {
        Status status = Status.Pending;
        if (status == Status.Running) {
            System.out.println("It's great!");
        }
        else if (status == Status.Flying) {
            System.out.println("Awesome!");
        } else if (status == Status.Pending) {
            System.out.println("Patience:)");
        }else {
            System.out.println("Yay!");
        }
    }

    private static void getStatusNordinal() {
        Status status = Status.Flying;
        System.out.println("Status Number : " + status.ordinal() + "\nStatus  : " + status);
        Status[] allStatus = Status.values();
        for (Status st : allStatus) {
            System.out.println(st.ordinal() + " " + st);
        }
    }
}
