import desserts.Dessert;

import java.util.*;

public class ShopWindow {

//    try done
    public void fillShop(ArrayList<Dessert> desserts, ArrayList<Dessert> shopWindow){
        System.out.println("выберите десерт из списка, который вы бы хотели добавить на витрину");
        int choice = 0, size = desserts.size();
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 - выход из добавления десертов.");

        while(true) {
            try {
                Menu.printList(desserts);
                choice = Integer.parseInt(scanner.nextLine());
                shopWindow.add(desserts.get(choice - 1));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("AGA");
            }
//            if (choice >= 1 && choice <= size)
//                shopWindow.add(desserts.get(choice - 1));
//            else if (choice != 0){
//                throw new Exception1("вы неверно выбрали номер десерта.");
//                System.out.println("вы неверно выбрали номер десерта.");
//            }
//            else
//                break;
        }
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
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

        Menu.printList(desserts);
    }
//  сделать трай кетч
    public void findDessert(ArrayList<Dessert> desserts){
        Scanner scan = new Scanner(System.in);
        System.out.println("введите диапазон калорий");
        int minCal, maxCal;
        boolean flag = true;

            while(true) {
                try{
                    System.out.println("введите нижнюю границу диапазона");
                    minCal = Integer.parseInt(scan.nextLine());
                    System.out.println("введите верхнюю границу диапазона");
                    maxCal = Integer.parseInt(scan.nextLine());
                    if(minCal < 0 || maxCal < 0 || minCal > maxCal) throw new Exception1(this.toString());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Неверный формат ввода");
                } catch (Exception1 e) {
                    System.out.println("Неверный ввод калорий");
                }
            }

//        flag = true;
        for(Dessert ds: desserts){
            if (ds.getCalories() >= minCal && ds.getCalories() <= maxCal){
                if (flag)
                    flag = false;
                System.out.println(ds + " входит в диапазон");
            }
        }
        if (flag)
            System.out.println("ни один десерт не подходит под заданный диапазон");
    }
    // try is done
    public static void  deleteDessert(ArrayList<Dessert> shopWindow) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int size = shopWindow.size();
        int x;
        Menu.printList(shopWindow);
        System.out.println("введите номер десерта для удаления");
        try {
            x = Integer.parseInt(scanner.nextLine());
//            if (x == 0) return;
            shopWindow.remove(x - 1);
            System.out.println("Удалено");
        }catch (NumberFormatException e){
            System.out.println("Значение введено некорректно");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Введенный номер не соответствует ни одному из индексов списка");
        }
//        do {
//            x = scanner.nextInt();
//            if (x <= 0 || x > size) {
//                System.out.println("введен неверный номер десерта");
//            } else
//                flag = false;
//        } while (flag);
//
//        shopWindow.remove(x - 1);

        System.out.println("новый список десертов:");
        Menu.printList(shopWindow);
    }
}

