import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new HatchbackCar("Renault", 7000, 7, 134.3));
        cars.add(new SedanCar("BMW", 25000, 12, 200));
        cars.add(new SedanCar("Audi", 15000, 11, 178.5));
        cars.add(new UniversalCar("Mercedes", 43400, 8, 234.5));
        TaxiStation taxiStation = new TaxiStation(cars);
        int x;
        do {
            System.out.println("Меню:\n1 - посчитать стоимость автопарка\n" +
                    "2 - провести сортировку автомобилей по расходу  топлива\n" +
                    "3 - найти автомобиль по задонному диапозону параметров\n" +
                    "4 - Выход ");

            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
            switch (x) {
                case 1:
                    taxiStation.AllPriceCar();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    taxiStation.sortFuelConsumption();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    taxiStation.carSelection();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Вы сделали неправильный выбор. Нужно от 1 до 4 !!!");
            }
        } while (x != 4);
    }
}


