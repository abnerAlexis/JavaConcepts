package concepts.objectEqualtoHashCode;

import java.util.Objects;

public class Car {
     String brand;
     int price;

//     public boolean equals(Car other) {
//          return this.brand.equals(other.brand) && this.price == other.price;
//     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Car car = (Car) o;
          return price == car.price && Objects.equals(brand, car.brand);
     }

     @Override
     public int hashCode() {
          return Objects.hash(brand, price);
     }

     @Override
     public String toString() {
          return "Brand : " + brand + "\nprice : " + price;
     }
}
