import desserts.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        example exmpl1 = new example();
        example exmpl2 = new example();
        example exmpl3 = new example();
        example exmpl4 = new example();
        example exmpl5 = new example();
        ArrayList<example> l = new ArrayList<>();
        l.add(exmpl1);
        l.add(exmpl2);
        l.add(exmpl3);
        l.add(exmpl4);
        l.add(exmpl5);
        exmpl5.name = "string";
        for(example ds: l){
            System.out.println(ds.name);
        }


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

            case 6:
                int size = shopWindow.size();
                if (size > 0){
                    ShopWindow.deleteDessert(shopWindow);
                }
                else{
                    System.out.println("витрина пуста");
                }
                break;
            case 7:
                Menu.printList(desserts);
                break;
            case 8:
                Menu.printList(shopWindow);
                break;
            default:
                flag = false;
        }
    }while(flag);
    }
}