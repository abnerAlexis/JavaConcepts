package concepts.upcastingNdowncasting;

public class App {

    public static void main(String[] args) {
        typeCasting();
        upCastingNdownCasting();
    }

    private static void upCastingNdownCasting() {
        //Up-casting - (SuperClass) doesn't need to be there. The code below without it up-casts by default.
        SuperClass obj = (SuperClass) new ExtendingClass();
        obj.printData1();
        //Down-casting
        ExtendingClass obj1 = (ExtendingClass) obj;
        obj1.printData2();
    }

    private static void typeCasting() {
        double number = 5.9;
        int anInt = (int) number;
        System.out.printf("Double Number : %.1f\n", number);
        System.out.printf("Double Number after TYPE CASTING to an integer number: %d\n", anInt);
    }

}
