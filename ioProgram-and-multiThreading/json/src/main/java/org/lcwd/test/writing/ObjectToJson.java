package org.lcwd.test.writing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

class Student {
    int id;
    String name;
    int age;
    String course;
}

public class ObjectToJson {
    public static void main(String[] args) throws IOException{
        Student s = new Student();
        s.id = 101;
        s.name = "Kartikey";
        s.age = 22;
        s.course = "PSQL";
        Gson gson = new Gson();
        Gson gs = new GsonBuilder().setPrettyPrinting().create();
        String json = gs.toJson(s);
        FileWriter fw = new FileWriter("student.json");
        fw.write(json);
        fw.close();
    }
}
