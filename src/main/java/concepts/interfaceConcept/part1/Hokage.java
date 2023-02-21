package concepts.interfaceConcept.part1;

public interface Hokage {
    //an interface can only hold constant variables that are
    //by default final and static.
    String LOCATION = "36.4967° N, 36.3607° E";

    //Even you don't use abstract keyword,
    //All methods in an interface are abstract
    //by default.

    public abstract void show();
    void config();
}
