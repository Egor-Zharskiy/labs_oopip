package desserts;

public class Dessert {
    protected String name;
    protected float price;
    protected int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                ", price = " + price +
                "$, calories = " + calories;
    }
}
