import desserts.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ShopWindow sw = new ShopWindow();
        MenuController mc = new MenuController();
        ArrayList<Dessert> desserts = new ArrayList<>();
        ArrayList<Dessert> shopWindow = new ArrayList<>();
        desserts.add(new Cake("торт с клубникой", 23.15f, 215));
        desserts.add(new Truffle("трюфель с посыпкой", 24.5f, 400));
        desserts.add(new Maffin("маффин с шоколадом", 100.05f, 500));

        int x;
        boolean flag = true;


        do {
            Menu.printMenu();
            try{
                x = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
                continue;
            }
            switch (x) {
                case 1:
                    mc.createDessert(desserts);
                    break;

                case 2:
                    sw.fillShop(desserts, shopWindow);
                    break;

                case 3:
                    sw.SumPrice(shopWindow);
                    break;
                case 4:
                    System.out.println("отсортированная по цене витрина:");
                    sw.sortDesserts(shopWindow);
                    break;

                case 5:
                    sw.findDessert(shopWindow);
                    break;

                case 6:
//                    int size = shopWindow.size();
//                    if (size > 0){
                        sw.deleteDessert(shopWindow);
//                    }
//                    else{
//                        System.out.println("витрина пуста");
//                    }
                    break;
                case 7:
                    Menu.printList(desserts);
                    break;
                case 8:
                    Menu.printList(shopWindow);
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }while(flag);
    }
}