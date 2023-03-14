public class UniversalCar extends Car{
    public UniversalCar(String brand, int price,int fuelСonsumption,double speed) {
        this.brand=brand;
        this.price=price;
        this.fuelСonsumption=fuelСonsumption;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "UniversalCar[" +
                "brand='" + brand + '\'' +
                ", fuelСonsumption=" + fuelСonsumption +
                "/100, price=" + price +
                "$, speed=" + speed +
                "км/ч ]";
    }
}
