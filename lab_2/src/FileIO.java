import desserts.Dessert;

import java.io.*;
import java.util.ArrayList;

public class FileIO {
    public void Read(ArrayList<Dessert> desserts, ArrayList<Dessert> ShopWindow) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            desserts = (ArrayList<Dessert>) ois.readObject();
            ShopWindow = (ArrayList<Dessert>) ois.readObject();

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
}
