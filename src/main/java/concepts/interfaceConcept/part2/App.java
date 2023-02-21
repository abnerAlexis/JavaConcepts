package concepts.interfaceConcept.part2;

public class App {

    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer alexis = new Developer();
        Developer leo = new Developer();
        alexis.devApp(laptop);
        leo.devApp(desktop);
    }
}
