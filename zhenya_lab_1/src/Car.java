
public abstract class Car {

    protected String brand;
    protected int fuelСonsumption;
    protected int price;
    protected double speed;

    @Override
    public String toString() {
        return "Car[" +
                "brand='" + brand + '\'' +
                ", fuelСonsumption=" + fuelСonsumption +
                ", price=" + price +
                ", speed=" + speed +
                ']';
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }



    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

