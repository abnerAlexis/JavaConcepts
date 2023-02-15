package concepts.encapsulation.human;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(new Human("Alexis", 18),
                                            new Human("Leo", 19),
                                            new Human("Beren", 45),
                                            new Human("Izgi", 15));
       // System.out.println(humans.toString());

        humans.forEach(System.out::print);
    }
}