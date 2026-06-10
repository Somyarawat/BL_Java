package org.lcwd.test.writing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJson {
    public static void main(String[] args) throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("id",101);
        obj.addProperty("name","Somya");
        obj.addProperty("age", 21);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(obj);
        //System.out.println(json);
        FileWriter fw = new FileWriter("student.json");
        fw.write(json);
        fw.close();
        System.out.println("JSON Created");
    }
}
