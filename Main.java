package L2_XML_JSON.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder jsonMessage = new StringBuilder();
        File f = new File("src/L2_XML_JSON/task2/example.json");

        try (FileReader in = new FileReader(f)) {
            char[] buf = new char[(int) f.length()];
            in.read(buf);
            jsonMessage.append(new String(buf));
        } catch (IOException e) {
        }

        Gson gson = new GsonBuilder().create();
        NoNameRoot root = gson.fromJson(jsonMessage.toString(), NoNameRoot.class);

        System.out.println(root.name + " " + root.surname);
        for (String phone : root.phones)
            System.out.println("phone: " + phone);
        Address adr = root.addresses;
        System.out.println("Contry: " + adr.country);
        System.out.println("City: " + adr.city);
        System.out.println("Street: " + adr.street);
    }
}
