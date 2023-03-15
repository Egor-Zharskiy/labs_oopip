import desserts.Dessert;

import java.time.format.DecimalStyle;
import java.util.ArrayList;

public class Menu {
    public static void printMenu(){
        System.out.println("Меню:\n1 - создать десерт\n2 - добавить десерт на витрину " +
                "\n3 - посчитать стоимость витрины\n" +
                "4 - провести сортировку десертов по цене\n" +
                "5 - найти десерт по заданному диапазону калорий\n" +
                "6 - удалить десерт с витрины\n" +
                "любая другая цифра - Выход ");
    }

    public static void printList(ArrayList <Dessert> list){
        int i = 0;
        for (Dessert ds: list){
            i++;
            System.out.println(i + " - " + ds.toString());
        }
    }

}
