package concepts.enums.enum2;

public enum Laptop {
    Macbook(2000), XPS(2200), Surface, Zbook(7500);

    private int price;

    Laptop() {
        price = 500;
        System.out.println("Default price : " + this.name());
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
