package concepts.objectEqualtoHashCode;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.price = 45000;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.price = 45000;

        //If there is no toString method;
        System.out.println(car1);                 //Displays the Hashcode. - concepts.objectEqualtoHashCode.Car@7a81197d

        System.out.println(car2);                 //Displays the Hashcode. - concepts.objectEqualtoHashCode.Car@5ca881b5

        System.out.println(car1 == car2);            //Prints false

        System.out.println(car1.equals(car2));  //Prints false without the equals() method in the Car class. Returns true with the method.

        System.out.println("Hashcode1 : " + car1.hashCode());
        System.out.println("Hashcode2 : " + car2.hashCode());
    }
}
