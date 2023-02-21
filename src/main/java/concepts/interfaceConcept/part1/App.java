package concepts.interfaceConcept.part1;

public class App {
    public static void main(String[] args) {
        Hokage chunin = new Chunin();
        chunin.show();
        chunin.config();

        System.out.println("Hokage is at " + Hokage.LOCATION);

        Kazekage chunin2 = new Chunin();
        chunin2.fightWith();
    }
}
