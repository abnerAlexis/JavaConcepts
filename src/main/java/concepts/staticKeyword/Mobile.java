package concepts.staticKeyword;

public class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Cell";
        System.out.println("In static block.\n" +
            "Static block gets called first.");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor. ");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() {
        System.out.println("In static method show1().");
    }

    public static void show2(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }


}
