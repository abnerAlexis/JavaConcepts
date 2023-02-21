package concepts.enums.enum2;

public class App {
    public static void main(String[] args) {
//        getSpecificLaptopNprice();
        getAllLaptopsNprices();
    }

    private static void getAllLaptopsNprices() {
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " price : $" + laptop.getPrice());
        }
    }

    private static void getSpecificLaptopNprice() {
        Laptop laptop = Laptop.Macbook;
        System.out.println(laptop + " price : $" + laptop.getPrice());
    }
}
