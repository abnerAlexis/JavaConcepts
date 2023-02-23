package concepts.staticKeyword;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1600;
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
//        obj2.price = 1700;
        Mobile.name = "Smart Phone";

        obj1.show();
        obj2.show();
        System.out.println();
        Mobile.name = "Cell";     //Even only ob1.name is changed. Both will be changed.
        System.out.println("Static variables are shared by all the objects.");
        obj1.show();
        obj2.show();

        System.out.println("Calling static variable with class name :");
        System.out.println("Mobile.name : " + Mobile.name);

        Mobile.show1();
        //If we have object reference we can call staatic method with non-static
        //content without a problem. See below.
        Mobile.show2(obj1);
    }
}
