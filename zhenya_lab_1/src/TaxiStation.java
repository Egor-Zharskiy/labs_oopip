import java.util.*;

public class TaxiStation {
    List<Car> carpool;

    public TaxiStation(List<Car> carpool) {
        this.carpool = carpool;
    }

    public void AllPriceCar() {
        int sum = 0;
        for (Car car : carpool) {
            sum += car.getPrice();
        }
        System.out.println("Стоимость автопарка : " + sum + "$");
    }


    public void sortFuelConsumption() {
        carpool.sort( new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getFuelСonsumption() - o2.getFuelСonsumption();
            }
        });


        for (Car car : carpool) {
            System.out.println("Потребление топлива: " + car.getFuelСonsumption() + "/100  " + car.toString());

            System.out.println();
        }
    }

    public void carSelection() {
        System.out.print("Введите диапозон желаймой скорости , для выбора подходящего автомобиля ");
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int minSpeed,maxSpeed;
        do {


            System.out.print("\nОт ");
             minSpeed = scan.nextInt();
            System.out.print("До ");
             maxSpeed = scan.nextInt();
            if (minSpeed > maxSpeed) {
                System.out.println("Вы ввели неверный диапозон\n Введите еще раз  ");
            } else {
                flag = false;
            }
        } while (flag);

        for (Car car : carpool) {
           if (car.getSpeed()>=minSpeed&&car.getSpeed()<=maxSpeed){
               System.out.println("Данный автомобиль: "+car.toString());
           }
        }
    }




}
