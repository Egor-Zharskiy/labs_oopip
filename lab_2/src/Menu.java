import desserts.Dessert;

import java.util.ArrayList;

public class Menu {
    public static void printMenu() {
        System.out.println("""

                ---------------------
                Меню:
                ______________________
                1 - посмотреть данные
                2 - сохранить данные
                3 - загрузить данные
                _____________________
                4 - создать десерт;\t5 - добавить десерт на витрину;
                6 - посчитать стоимость витрины;\t7 - провести сортировку десертов по цене;
                8 - найти десерт по заданному диапазону калорий;\t9 - удалить десерт с витрины;
                10 - вывод всех десертов;\t11 - вывод витрины;
                12 - выход из программы
                """
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
