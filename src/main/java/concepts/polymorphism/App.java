package concepts.polymorphism;

public class App {
    public static void main(String[] args) {
        System.out.println("Extending parent class each object behaves differently in Polyumorphism.");
        System.out.println("Creating each object of one type (the reference of the parent class) - Dynamic method dispatch.");
        System.out.println("Runtime Polymorphism");
        Computer computer = new Computer();
        computer.show();
        Computer laptop = new Laptop();
        laptop.show();
        Computer desktop = new Desktop();
        desktop.show();
    }
}
