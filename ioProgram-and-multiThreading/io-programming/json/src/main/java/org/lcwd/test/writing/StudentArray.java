package org.lcwd.test.writing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Students{
    int id;
    String name;
    Students(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Students[] students = {new Students(101,"Somya"), new Students(102,"Kartikey")};
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(students);
        System.out.println(json);
    }
}
