import desserts.Dessert;

import java.util.ArrayList;

public class Menu {
    public static void printMenu() {
        System.out.println("\n---------------------\nМеню:\n1 - создать десерт;\t2 - добавить десерт на витрину;" +
                "\n3 - посчитать стоимость витрины;\t" +
                "4 - провести сортировку десертов по цене;\n" +
                "5 - найти десерт по заданному диапазону калорий;\t" +
                "6 - удалить десерт с витрины;\n" +
                "7 - вывод всех десертов;\t" +
                "8 - вывод витрины;\n" +
                "9 - выход из программы\n"
        );
    }

    public void printList(ArrayList<Dessert> list) {
        int i = 0;
        try {
            if (list.size() == 0) throw new ZeroLength(this.toString());

        } catch (ZeroLength e) {
            System.out.println("Список пуст");
            return;
        }
        for (Dessert ds : list) {
            i++;
            System.out.println(i + " - " + ds.toString());
        }
    }

}
