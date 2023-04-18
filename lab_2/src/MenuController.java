import desserts.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {

    public static ArrayList<Dessert> input(String name, int cal, float price, Dessert dessert, ArrayList<Dessert> table){
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("введите название десерта");
            name = scanner.nextLine();
            try{
                System.out.println("введите калорийность десерта");
                cal = Integer.parseInt(scanner.nextLine());
                System.out.println("введите цену десерта");
                price = Float.parseFloat(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }

            dessert.setName(name);
            dessert.setPrice(price);
            dessert.setCalories(cal);
            table.add(dessert);
            return table;
        }
    }
    public static void createDessert(ArrayList<Dessert> list){
        System.out.println("Выберите десерт для создания\n1 - маффин\n2 - торт\n3 - трюфель");

        Scanner scanner = new Scanner(System.in);
        int cal = 0, key;
        String name = "";
        float price = 0f;

        key = scanner.nextInt();


        switch (key){
            case 1:
                Maffin mf = new Maffin("", 0f, 0);
                list = input(name, cal, price, mf, list);
                break;
            case 2:
                Cake ck = new Cake("", 0f, 0);
                list = input(name, cal, price, ck, list);
                break;
            case 3:
                Truffle trf = new Truffle("", 0f, 0);
                list = input(name, cal, price, trf, list);
                break;
        }

    }
}
