import desserts.Dessert;

import java.io.*;
import java.util.ArrayList;

public class WriteObject {
    public void WriteInfo(ArrayList<Dessert> array) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
          oos.writeObject(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
