import desserts.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {

    public ArrayList<Dessert> input(String name, int cal, float price, Dessert dessert, ArrayList<Dessert> table) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("введите название десерта");
            name = scanner.nextLine();
            try {
                System.out.println("введите калорийность десерта");
                cal = Integer.parseInt(scanner.nextLine());
                System.out.println("введите цену десерта");
                price = Float.parseFloat(scanner.nextLine());
                if (cal < 0 || price < 0) throw new Exception1(this.toString());
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
                continue;
            } catch (Exception1 e) {
                System.out.println("Введены отрицательные значения");
                continue;
            }

            dessert.setName(name);
            dessert.setPrice(price);
            dessert.setCalories(cal);
            table.add(dessert);
            return table;
        }
    }

    public void createDessert(ArrayList<Dessert> desserts) {
        System.out.println("Выберите десерт для создания\n1 - маффин\n2 - торт\n3 - трюфель");
        Scanner scanner = new Scanner(System.in);
        int cal = 0, key;
        String name = "";
        float price = 0f;

        key = scanner.nextInt();


        switch (key) {
            case 1:
                Maffin mf = new Maffin("", 0f, 0);
                desserts = input(name, cal, price, mf, desserts);
                break;
            case 2:
                Cake ck = new Cake("", 0f, 0);
                desserts = input(name, cal, price, ck, desserts);
                break;
            case 3:
                Truffle trf = new Truffle("", 0f, 0);
                desserts = input(name, cal, price, trf, desserts);
                break;
            default:
                System.out.println("Неверный выбор");

        }
    }
}
