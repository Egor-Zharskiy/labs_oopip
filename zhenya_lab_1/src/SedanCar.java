import java.io.Serializable;

public class SedanCar extends Car implements Serializable {


    public SedanCar(String brand, int price, int fuelConsumption, double speed) {
        this.brand = brand;
        this.price = price;
        this.fuelСonsumption = fuelConsumption;
        this.speed = speed;

    }

    @Override
    public String toString() {
        return "SedanCar{" +
                "brand='" + brand + '\'' +
                ", fuelСonsumption=" + fuelСonsumption +
                "/100, price=" + price +
                "$, speed=" + speed +
                "км/ч }";
    }
}
