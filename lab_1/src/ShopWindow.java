import desserts.Dessert;

import java.util.*;

public class ShopWindow {


    public static ArrayList<Dessert> fillShop(ArrayList<Dessert> desserts, ArrayList<Dessert> shopWindow){
        System.out.println("выберите десерт из списка, который вы бы хотели добавить на витрину");

        int i = 1, choice = 0, size = desserts.size();
        Scanner scanner = new Scanner(System.in);

        Menu.printList(desserts);

//        for (Dessert ds: desserts){
//            System.out.println(i + " - " + ds);
//            i++;
//        }
//        i++;
        System.out.println("0 - выход из добавления десертов.");

        while(true){
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= size + 1)
                shopWindow.add(desserts.get(choice - 1));
            else if (choice != 0)
                System.out.println("вы неверно выбрали номер десерта.");
            else
                break;
        }

        return shopWindow;

    }



    public static void SumPrice(ArrayList<Dessert> desserts){
        float sum = 0f;
        for(Dessert dessert : desserts){
            sum += dessert.getPrice();
        }
        System.out.println("цена витрины = " + sum + "$");
    }

    public static void sortDesserts(ArrayList<Dessert> desserts){
        desserts.sort(new Comparator<Dessert>() {
            @Override
            public int compare(Dessert o1, Dessert o2) {
                return (o1.getCalories() -o2.getCalories());
            }
        });

        Menu.printList(desserts);
    }

    public static void findDessert(ArrayList<Dessert> desserts){
        Scanner scan = new Scanner(System.in);
        System.out.println("введите диапазон калорий");
        int minCal, maxCal;
        boolean flag = true;

        do{
            System.out.println("введите нижнюю границу диапазона");
            minCal = scan.nextInt();
            System.out.println("введите верхнюю границу диапазона");
            maxCal = scan.nextInt();
            if (minCal > maxCal){
                System.out.println("нижняя граница меньше верхней");
            }
            else{
                flag = false;
            }
        }while(flag);

        flag = true;
        for(Dessert ds: desserts){
            System.out.println(ds.toString());
            if (ds.getCalories() >= minCal && ds.getCalories() <= maxCal){
                if (flag)
                    flag = false;
                System.out.println(ds.toString() + "входит в диапазон");
            }
        }
        if (flag)
            System.out.println("ни один десерт не подходит под заданный диапазон");

    }


    public static ArrayList<Dessert> deleteDessert(ArrayList<Dessert> shopWindow) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int size = shopWindow.size();
        int x;
        Menu.printList(shopWindow);
        System.out.println("введите номер десерта для удаления");
        do {
            x = scanner.nextInt();
            if (x <= 0 || x > size) {
                System.out.println("введен неверный номер десерта");
            } else
                flag = false;
        } while (flag);

        shopWindow.remove(x - 1);

        System.out.println("новый список десертов:");
        Menu.printList(shopWindow);

        return shopWindow;
    }

    }

