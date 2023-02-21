package concepts.interfaceConcept.part1;

public class Chunin implements Hokage, Kazekage{
    @Override
    public void show() {
        System.out.println("In show().");
    }

    @Override
    public void config() {
        System.out.println("In config().");
    }

    @Override
    public void fightWith() {
        System.out.println("Fighting with Orochimoro.");
    }
}
