package concepts.abstractKeyWord;

public class App {
    public static void main(String[] args) {
        //Car car = new Car(); You can not create
        // an object of an abstract class.

        Car accord = new AccordAC();
        accord.playMusic();
        accord.drive();
        accord.turnOnAC();

    }
}
/*
    If you have an abstract method in
    your class, that class has to be
    abstract as well.

    You can have an abstract class
    with no abstract method in it.

    If you don't want to use all abstract
    methods in the abstract class
    you are extending to, You can make
    your extending class abstract too.
    This class is called concrete class.
    But in this case you will need to make
    changes on your instantiation.
 */