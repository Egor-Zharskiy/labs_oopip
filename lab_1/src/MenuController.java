import desserts.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {

    public static ArrayList<Dessert> input(String name, int cal, float price, Dessert dessert, ArrayList<Dessert> table){

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите название десерта");
        name = scanner.nextLine();
        System.out.println("введите калорийность десерта");
        cal = scanner.nextInt();
        System.out.println("введите цену сея ебучего десерта");
        price = scanner.nextFloat();
        dessert.setName(name);
        dessert.setPrice(price);
        dessert.setCalories(cal);
        table.add(dessert);
        return table;
    }
    public static ArrayList<Dessert> createDessert(ArrayList<Dessert> list){
        System.out.println("Выберите десерт для создания\n1 - маффин\n2 - торт\n3 - трюфель");
        char key;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cal = 0;
        String name = "";
        float price = 0f;

        try {
            key = br.readLine().charAt(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        switch (key){
            case '1':
                Maffin mf = new Maffin("", 0f, 0);
                list = input(name, cal, price, mf, list);
                break;
            case '2':
                Cake ck = new Cake("", 0f, 0);
                list = input(name, cal, price, ck, list);
                break;
            case '3':
                Truffle trf = new Truffle("", 0f, 0);
                list = input(name, cal, price, trf, list);
                break;
        }

        return list;
    }
}
