import desserts.Dessert;

import java.io.*;
import java.util.ArrayList;

public class FileIO {
    public void View() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            ArrayList<Dessert> desserts = (ArrayList<Dessert>) ois.readObject();
            ArrayList<Dessert> ShopWindow = (ArrayList<Dessert>) ois.readObject();
            System.out.println("список всех десертов:" + desserts);
            System.out.println("Витрина:" + ShopWindow);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void Write(ArrayList<Dessert> desserts, ArrayList<Dessert> ShopWindow) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
            oos.writeObject(desserts);
            oos.writeObject(ShopWindow);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<ArrayList<Dessert>> Read() {
        ArrayList<Dessert> desserts = new ArrayList<>();
        ArrayList<Dessert> ShopWindow = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            desserts = (ArrayList<Dessert>) ois.readObject();
            ShopWindow = (ArrayList<Dessert>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<ArrayList<Dessert>> dessertList = new ArrayList<>();
        dessertList.add(desserts);
        dessertList.add(ShopWindow);
        return dessertList;
    }
}
