import desserts.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        FileIO file = new FileIO();
        Scanner scan = new Scanner(System.in);
        ShopWindow sw = new ShopWindow();
        MenuController mc = new MenuController();
        Menu menu = new Menu();
        ArrayList<Dessert> desserts = new ArrayList<>();
        ArrayList<Dessert> shopWindow = new ArrayList<>();
        desserts.add(new Cake("торт с клубникой", 23.15f, 215));
        desserts.add(new Truffle("трюфель с посыпкой", 24.5f, 400));
        desserts.add(new Maffin("маффин с шоколадом", 100.05f, 500));
        int x;
        boolean flag = true;


        do {
            menu.printMenu();
            try {
                x = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
                continue;
            }
            switch (x) {
                case 1:
                    file.View();
                    break;
                case 2:
                    file.Write(desserts, shopWindow);
                    break;
                case 3:
                    ArrayList<ArrayList<Dessert>> lists = file.Read();
                    desserts = lists.get(0);
                    shopWindow = lists.get(1);


                    break;
                case 4:
                    mc.createDessert(desserts);
//                    file.Write(desserts, shopWindow);
                    break;

                case 5:
//                    file.Read(desserts, shopWindow);
                    sw.fillShop(desserts, shopWindow);
//                    file.Write(desserts, shopWindow);
                    break;

                case 6:
//                    file.Read(desserts, shopWindow);
                    sw.SumPrice(shopWindow);
                    break;
                case 7:
                    System.out.println("отсортированная по цене витрина:");
//                    file.Read(desserts, shopWindow);
                    sw.sortDesserts(shopWindow);
                    break;

                case 8:
//                    file.Read(desserts, shopWindow);
                    sw.findDessert(shopWindow);
                    break;

                case 9:
//                    file.Read(desserts, shopWindow);
                    sw.deleteDessert(shopWindow);
//                    file.Write(desserts, shopWindow);
                    break;
                case 10:
//                    file.Read(desserts, shopWindow);
                    menu.printList(desserts);
                    break;
                case 11:
//                    file.Read(desserts, shopWindow);
                    menu.printList(shopWindow);
                    break;
                case 12:
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        } while (flag);
    }
}