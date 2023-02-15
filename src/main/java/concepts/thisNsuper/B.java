package concepts.thisNsuper;

public class B extends A{
    public B() {
        super();
        System.out.println("Inside B class.");
    }

    public B(int n) {
        this();
        System.out.println("In int param B const.");
    }
}
