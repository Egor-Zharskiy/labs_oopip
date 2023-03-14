import desserts.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Dessert> desserts = new ArrayList<>();
        ArrayList<Dessert> shopWindow = new ArrayList<>();
        desserts.add(new Cake("торт с клубникой", 23.15f, 215));
        desserts.add(new Truffle("трюфель с посыпкой", 24.5f, 400));
        desserts.add(new Maffin("маффин с шоколадом", 100.05f, 500));

    int x;
    boolean flag = true;

    do {
        Menu.printMenu();
        x = scan.nextInt();
        switch (x) {
            case 1:
                MenuController.createDessert(desserts);
                break;

            case 2:
                ShopWindow.fillShop(desserts, shopWindow);
                break;

            case 3:
                ShopWindow.SumPrice(shopWindow);
                break;
            case 4:
                System.out.println("отсортированная по цене витрина:");
                ShopWindow.sortDesserts(shopWindow);
                break;

            case 5:
                ShopWindow.findDessert(shopWindow);
                break;

            default:
                flag = false;
        }
    }while(flag);


    }
}